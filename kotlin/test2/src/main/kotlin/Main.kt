import dao.MemberDao

fun main(args: Array<String>) {
    val memDao = MemberDao()

    memDao.insert()

    memDao.allPrint()


}