package com.yatochk.tiktokdownloader.dagger.module

import com.yatochk.tiktokdownloader.dagger.App
import com.yatochk.tiktokdownloader.presenter.DownloadPresenter
import com.yatochk.tiktokdownloader.presenter.GalleryPresenter
import com.yatochk.tiktokdownloader.presenter.MainPresenter
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class PresenterModule {

    @Provides
    @Singleton
    fun provideMainPresenter(): MainPresenter = MainPresenter(App.component.model)

    @Provides
    @Singleton
    fun provideGalleryPresenter(): GalleryPresenter = GalleryPresenter()

    @Provides
    @Singleton
    fun provideDownloadPresenter(): DownloadPresenter = DownloadPresenter()
}