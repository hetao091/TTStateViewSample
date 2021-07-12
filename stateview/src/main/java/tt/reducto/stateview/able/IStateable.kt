package tt.reducto.stateview.able

import android.view.View

/**
 * ……。
 *
 * <p>......。</p>
 * <ul><li></li></ul>
 * <br>
 * <strong>Time</strong>&nbsp;&nbsp;&nbsp;&nbsp;2021/7/10 15:58<br>
 * <strong>CopyRight</strong>&nbsp;&nbsp;&nbsp;&nbsp;2020, tt.reducto<br>
 *
 * @version  : 1.0.0
 * @author   : hetao
 */
internal interface IStateable {
    //<editor-fold desc="属性定义">
    /* 空布局*/
    var emptyView: View?

    /* 正在加载布局 */
    var loadingView: View?

    /* 错误布局 */
    var errorView: View?

    /* 无网络布局 */
    var noNetworkView: View?

    /* 记录管理器 当前布局状态*/
    var currentState: Int

    /* */
    var viewStateListener: ((formerState: Int, curState: Int) -> Unit)?

    /* 点击监听 */
    var clickListener: ((state: Int, view: View) -> Unit)?

    //</editor-fold>





}