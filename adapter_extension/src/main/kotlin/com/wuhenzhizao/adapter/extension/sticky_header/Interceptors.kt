package com.wuhenzhizao.adapter.extension.sticky_header

import android.view.View
import com.wuhenzhizao.adapter.interfaces.Interceptor

/**
 * Created by liufei on 2017/12/3.
 */
interface HeaderViewHolderCreateInterceptor<in T : Any, in VH> : Interceptor<T, VH> {
    /**
     * @param vh
     */
    fun onCreateHeaderViewHolder(vh: VH)
}

interface HeaderViewHolderBindInterceptor<in T : Any, in VH> : Interceptor<T, VH> {
    /**
     * @param position
     * @param item
     * @param vh
     */
    fun onBindHeaderViewHolder(position: Int, item: T, vh: VH)
}


interface OnHeaderClickListener {
    fun onHeaderClick(headerView: View, position: Int, headerId: Long)
}