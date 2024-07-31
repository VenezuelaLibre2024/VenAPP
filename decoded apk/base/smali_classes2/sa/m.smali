.class final Lsa/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/dynamic/c;


# instance fields
.field private final a:Landroid/view/ViewGroup;

.field private final b:Lta/c;

.field private c:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;Lta/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p2}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lta/c;

    iput-object p2, p0, Lsa/m;->b:Lta/c;

    invoke-static {p1}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iput-object p1, p0, Lsa/m;->a:Landroid/view/ViewGroup;

    return-void
.end method


# virtual methods
.method public final a(Lsa/f;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lsa/m;->b:Lta/c;

    new-instance v1, Lsa/l;

    invoke-direct {v1, p0, p1}, Lsa/l;-><init>(Lsa/m;Lsa/f;)V

    invoke-interface {v0, v1}, Lta/c;->T0(Lta/n;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 2

    :try_start_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-static {p1, v0}, Lta/b0;->b(Landroid/os/Bundle;Landroid/os/Bundle;)V

    iget-object v1, p0, Lsa/m;->b:Lta/c;

    invoke-interface {v1, v0}, Lta/c;->onCreate(Landroid/os/Bundle;)V

    invoke-static {v0, p1}, Lta/b0;->b(Landroid/os/Bundle;Landroid/os/Bundle;)V

    iget-object p1, p0, Lsa/m;->b:Lta/c;

    invoke-interface {p1}, Lta/c;->getView()Lcom/google/android/gms/dynamic/b;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/dynamic/d;->g2(Lcom/google/android/gms/dynamic/b;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    iput-object p1, p0, Lsa/m;->c:Landroid/view/View;

    iget-object p1, p0, Lsa/m;->a:Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->removeAllViews()V

    iget-object p1, p0, Lsa/m;->a:Landroid/view/ViewGroup;

    iget-object v0, p0, Lsa/m;->c:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final onDestroy()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lsa/m;->b:Lta/c;

    invoke-interface {v0}, Lta/c;->onDestroy()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lua/v;

    invoke-direct {v1, v0}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final onResume()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lsa/m;->b:Lta/c;

    invoke-interface {v0}, Lta/c;->onResume()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lua/v;

    invoke-direct {v1, v0}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    :try_start_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-static {p1, v0}, Lta/b0;->b(Landroid/os/Bundle;Landroid/os/Bundle;)V

    iget-object v1, p0, Lsa/m;->b:Lta/c;

    invoke-interface {v1, v0}, Lta/c;->onSaveInstanceState(Landroid/os/Bundle;)V

    invoke-static {v0, p1}, Lta/b0;->b(Landroid/os/Bundle;Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lua/v;

    invoke-direct {v0, p1}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final onStart()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lsa/m;->b:Lta/c;

    invoke-interface {v0}, Lta/c;->onStart()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lua/v;

    invoke-direct {v1, v0}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final onStop()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lsa/m;->b:Lta/c;

    invoke-interface {v0}, Lta/c;->onStop()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lua/v;

    invoke-direct {v1, v0}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method
