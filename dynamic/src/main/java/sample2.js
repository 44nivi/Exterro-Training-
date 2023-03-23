const fs = require('fs')
const path=require('path');
const folderlist=[]
function outputallfolders(folderpath){
	folderpath.forEach(folderpath=>{
		console.warn("file location  is ",folderpath)
		fs.readdir(folderpath,(err,folderpath)=>{
		folderpath.forEach((item) =>{
			console.warn("the file name is ",item)
		})
		})
		const result=fs.readdirSync(folderpath)
		const folder=result.filter(res=>fs.lstatSync(path.resolve(folderpath,res)).isDirectory())
		const innerfolderpath=folder.map(folder=>path.resolve(folderpath,folder))
		if(innerfolderpath.length===0)
		{return
		}
		innerfolderpath.forEach(innerfolder=>folderlist.push(innerfolder))
		outputallfolders(innerfolderpath)
		
	})
	
}

outputallfolders([path.resolve(__dirname,"sweet")])
console.log(folderlist)