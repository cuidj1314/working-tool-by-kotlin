package org.example.filecopy

fun main() {

    val nameListFile = "E:\\test\\test\\fileList.txt"
    val inPutPath = "D:\\svn\\03_開発庫\\06_本変換\\ソース\\02_手修正後ソース"
    val outPutPath = "E:\\test\\test\\02手修正後"
    val fileNameList = FileNameList().fileNameAdd(nameListFile)
    val count = OutputFile().readFileByName(inPutPath, outPutPath, fileNameList)
    println("実行完了しました、出力ファイル数：---------> $count 件")
}
