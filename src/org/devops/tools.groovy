package org.devops

//打印内容
def PrintMes(content) {
   println(content)
}

def PrintMsg(value,color) {
	//定义字典
	//value打印信息,color颜色
    colors = ['red'   : "\033[40;31m >>>>>>>>>>>${value}<<<<<<<<<<< \033[0m",
              'blue'  : "\033[47;34m ${value} \033[0m",
              'green' : "[1;32m>>>>>>>>>>${value}>>>>>>>>>>[m",
              'green1' : "\033[40;32m >>>>>>>>>>>${value}<<<<<<<<<<< \033[0m" ]

	//调用
	ansiColor('xterm') {
		println(colors[color])
	}
}
