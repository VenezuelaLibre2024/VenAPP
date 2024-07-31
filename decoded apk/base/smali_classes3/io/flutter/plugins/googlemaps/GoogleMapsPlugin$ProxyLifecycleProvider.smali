.class final Lio/flutter/plugins/googlemaps/GoogleMapsPlugin$ProxyLifecycleProvider;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;
.implements Landroidx/lifecycle/k;
.implements Lio/flutter/plugins/googlemaps/LifecycleProvider;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/googlemaps/GoogleMapsPlugin;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "ProxyLifecycleProvider"
.end annotation


# instance fields
.field private final lifecycle:Landroidx/lifecycle/l;

.field private final registrarActivityHashCode:I


# direct methods
.method constructor <init>(Landroid/app/Activity;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroidx/lifecycle/l;

    invoke-direct {v0, p0}, Landroidx/lifecycle/l;-><init>(Landroidx/lifecycle/k;)V

    iput-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapsPlugin$ProxyLifecycleProvider;->lifecycle:Landroidx/lifecycle/l;

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iput v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapsPlugin$ProxyLifecycleProvider;->registrarActivityHashCode:I

    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void
.end method


# virtual methods
.method public getLifecycle()Landroidx/lifecycle/f;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapsPlugin$ProxyLifecycleProvider;->lifecycle:Landroidx/lifecycle/l;

    return-object v0
.end method

.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    iget p2, p0, Lio/flutter/plugins/googlemaps/GoogleMapsPlugin$ProxyLifecycleProvider;->registrarActivityHashCode:I

    if-eq p1, p2, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapsPlugin$ProxyLifecycleProvider;->lifecycle:Landroidx/lifecycle/l;

    sget-object p2, Landroidx/lifecycle/f$a;->ON_CREATE:Landroidx/lifecycle/f$a;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/l;->h(Landroidx/lifecycle/f$a;)V

    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapsPlugin$ProxyLifecycleProvider;->registrarActivityHashCode:I

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapsPlugin$ProxyLifecycleProvider;->lifecycle:Landroidx/lifecycle/l;

    sget-object v0, Landroidx/lifecycle/f$a;->ON_DESTROY:Landroidx/lifecycle/f$a;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/l;->h(Landroidx/lifecycle/f$a;)V

    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    iget v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapsPlugin$ProxyLifecycleProvider;->registrarActivityHashCode:I

    if-eq p1, v0, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapsPlugin$ProxyLifecycleProvider;->lifecycle:Landroidx/lifecycle/l;

    sget-object v0, Landroidx/lifecycle/f$a;->ON_PAUSE:Landroidx/lifecycle/f$a;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/l;->h(Landroidx/lifecycle/f$a;)V

    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    iget v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapsPlugin$ProxyLifecycleProvider;->registrarActivityHashCode:I

    if-eq p1, v0, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapsPlugin$ProxyLifecycleProvider;->lifecycle:Landroidx/lifecycle/l;

    sget-object v0, Landroidx/lifecycle/f$a;->ON_RESUME:Landroidx/lifecycle/f$a;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/l;->h(Landroidx/lifecycle/f$a;)V

    return-void
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    iget v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapsPlugin$ProxyLifecycleProvider;->registrarActivityHashCode:I

    if-eq p1, v0, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapsPlugin$ProxyLifecycleProvider;->lifecycle:Landroidx/lifecycle/l;

    sget-object v0, Landroidx/lifecycle/f$a;->ON_START:Landroidx/lifecycle/f$a;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/l;->h(Landroidx/lifecycle/f$a;)V

    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    iget v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapsPlugin$ProxyLifecycleProvider;->registrarActivityHashCode:I

    if-eq p1, v0, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapsPlugin$ProxyLifecycleProvider;->lifecycle:Landroidx/lifecycle/l;

    sget-object v0, Landroidx/lifecycle/f$a;->ON_STOP:Landroidx/lifecycle/f$a;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/l;->h(Landroidx/lifecycle/f$a;)V

    return-void
.end method
