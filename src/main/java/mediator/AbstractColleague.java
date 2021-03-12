package mediator;

/**
 * 抽象同事类
 */
public abstract class AbstractColleague {
	//中介者，使用有参构造创建抽象中介者
	protected AbstractMediator abstractMediator;
	public AbstractColleague(AbstractMediator abstractMediator){
		this.abstractMediator = abstractMediator;
	}
}
