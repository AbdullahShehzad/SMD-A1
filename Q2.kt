import javax.print.DocFlavor.STRING

abstract class Person() {
    abstract val ID: Int
    abstract val Name: String
    abstract val Address: String
    abstract val Phone: Int
    abstract val Profession: String

    fun Register(UID: Int): String = Name
    fun Perform(duty: String): String = Profession
    fun Include(service: String): String = Profession
    fun like(Item : String) : String = Profession
}

open abstract class Student() : Person() {
    abstract val StudentID : String
    abstract val Major : String
    abstract val Year : Int
    abstract val Semester : Int
    abstract val College : String
    abstract  val grade : Int

    fun Register(Course : String) : String = StudentID
    fun getGrade(Course : String) : Int = grade
    fun Attend(Class : Int) : String = College
    fun Learn() : String = Major
}

open abstract class Staff() : Person() {
    abstract val EmpID: String
    abstract val EmpRole: String
    abstract val EmpDept: String
    abstract val EmpSalary: Float
    abstract val EmpExperience: Int

    fun Attned(Duty: String): String = EmpRole
    fun GetPromotion(): String = "You are Promoted"
    fun getSalary(): Int = EmpSalary.toInt()
}

open class PGStudent(
    override val ID: Int,
    override val Name: String,
    override val Address: String,
    override val Phone: Int,
    override val Profession: String,
    override val StudentID: String,
    override val Major: String,
    override val Year: Int,
    override val Semester: Int,
    override val College: String,
    override val grade: Int,
    val RollNo : String,
    val Specialization : String
) : Student()
{
    fun SubmitThesis()
    {
        println("\nThe Thesis is submitted successfully!\n")
    }
}

open class Faculty(
    override val ID: Int,
    override val Name: String,
    override val Address: String,
    override val Phone: Int,
    override val Profession: String,
    override val EmpID: String,
    override val EmpRole: String,
    override val EmpDept: String,
    override val EmpSalary: Float,
    override val EmpExperience: Int,
    val FacultySpecialization : String,
    val Section : String,
    val NoofStudents : Int,
    val Qualification : String
) : Staff()
{
    fun Teach(Course : String) : String = FacultySpecialization
    fun Assess(StudentGrade : Int) : String = Section
}

open class Technician(
    override val ID: Int,
    override val Name: String,
    override val Address: String,
    override val Phone: Int,
    override val Profession: String,
    override val EmpID: String,
    override val EmpRole: String,
    override val EmpDept: String,
    override val EmpSalary: Float,
    override val EmpExperience: Int,
    val TechType : String
) : Staff()
{
    fun Maintain(Lab : String) : String = "\nThis Lab is maintained\n"
    fun Install(System : String) : String = "\nThis software is Installed successfully!\n"
}


fun main()
{
    val Std1 = PGStudent(
        1,
        "Abdullah",
        "street123",
        12345,
        "Teacher",
        "20L-1247",
        "CS",
        2024,
        7,
        "FAST NUCES",
        10,
        "1247",
        "Cyber Security")

    Std1.SubmitThesis()

    val Fac1 = Faculty(
        2,
        "Abdullah",
        "street123",
        12345,
        "Teacher",
        "1",
        "Logistics",
        "CS",
        2000.8F,
        6,
        "Cyber Security",
        "B",
        38,
        "MSCS"
    )
    println(Fac1.Teach("CS"))

    val Tech1 = Technician(
        2,
        "Abdullah",
        "street123",
        12345,
        "Teacher",
        "1",
        "Logistics",
        "CS",
        2000.8F,
        6,
        "Robotics"
    )
    println(Tech1.Install("Visual Studio 2022"))
}