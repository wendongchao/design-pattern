package Iterator;

/**
 * 迭代器模式：它提供一种方法访问一个容器对象中各个元素，而又不暴露该对象的内部细节。
 */
public class MainBoss {
	public static void main(String[] args) {
		IProject project = new Project();
		project.add("星球大战项目aaa",10,100000);
		project.add("星球大战项目bbb",10,100000);
		project.add("星球大战项目ccc",10,100000);
		for(int i=4;i<104;i++){
			project.add("第"+i+"个项目",i*5,i*1000);
		}
		IProjectIterator projectIterator = project.iterator();
		while (projectIterator.hasNext()){
			IProject p = (IProject) projectIterator.next();
			System.out.println(p.getProjectInfo());
		}
	}
}
