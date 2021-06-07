package com.honestastrology.realmexample.ui.control;

import com.honestastrology.realmexample.database.DBOperator;
import com.honestastrology.realmexample.ui.view.Viewer;

import io.realm.RealmObject;

/**
 * このインターフェースを実装したクラスが
 * DBOperatorへリクエストを送り、
 * 返される結果をViewerへ反映させることを想定している
 */

public interface Command<E extends RealmObject> {
    /** ボタン等のGUIとこのインターフェースの実装コマンドを紐付けるIDを取得するメソッド*/
    public int getUIId();
    /** ボタン押下等リクエストの実行メソッド*/
    public void execute(Viewer<E> viewer, DBOperator _dbOperator);
    
}
