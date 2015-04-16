package jp.yuki.ohnishi.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import jp.yuki.ohnishi.form.EchoForm;

public class EchoAction {
	
//	アクションフォーム
	@Resource
	@ActionForm
	protected EchoForm echoForm;
	
//	入力画面の実行メソッド
	@Execute(validator=false)
	public String index(){
		return "input.jsp";
	}
	
//	エコー画面の実行メソッド
	@Execute(validator=true, input="input.jsp")
	public String echo(){
		return "echo.jsp";
	}

}
