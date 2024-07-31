.class final Lsa/n;
.super Lcom/google/android/gms/dynamic/a;
.source "SourceFile"


# instance fields
.field private final e:Landroid/view/ViewGroup;

.field private final f:Landroid/content/Context;

.field protected g:Lcom/google/android/gms/dynamic/e;

.field private final h:Lcom/google/android/gms/maps/GoogleMapOptions;

.field private final i:Ljava/util/List;


# direct methods
.method constructor <init>(Landroid/view/ViewGroup;Landroid/content/Context;Lcom/google/android/gms/maps/GoogleMapOptions;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/dynamic/a;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lsa/n;->i:Ljava/util/List;

    iput-object p1, p0, Lsa/n;->e:Landroid/view/ViewGroup;

    iput-object p2, p0, Lsa/n;->f:Landroid/content/Context;

    iput-object p3, p0, Lsa/n;->h:Lcom/google/android/gms/maps/GoogleMapOptions;

    return-void
.end method


# virtual methods
.method protected final a(Lcom/google/android/gms/dynamic/e;)V
    .locals 0

    iput-object p1, p0, Lsa/n;->g:Lcom/google/android/gms/dynamic/e;

    invoke-virtual {p0}, Lsa/n;->q()V

    return-void
.end method

.method public final p(Lsa/f;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/dynamic/a;->b()Lcom/google/android/gms/dynamic/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/dynamic/a;->b()Lcom/google/android/gms/dynamic/c;

    move-result-object v0

    check-cast v0, Lsa/m;

    invoke-virtual {v0, p1}, Lsa/m;->a(Lsa/f;)V

    return-void

    :cond_0
    iget-object v0, p0, Lsa/n;->i:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final q()V
    .locals 4

    iget-object v0, p0, Lsa/n;->g:Lcom/google/android/gms/dynamic/e;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/dynamic/a;->b()Lcom/google/android/gms/dynamic/c;

    move-result-object v0

    if-nez v0, :cond_2

    :try_start_0
    iget-object v0, p0, Lsa/n;->f:Landroid/content/Context;

    invoke-static {v0}, Lsa/e;->a(Landroid/content/Context;)I

    iget-object v0, p0, Lsa/n;->f:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lta/c0;->a(Landroid/content/Context;Lsa/e$a;)Lta/e0;

    move-result-object v0

    iget-object v1, p0, Lsa/n;->f:Landroid/content/Context;

    invoke-static {v1}, Lcom/google/android/gms/dynamic/d;->h2(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/b;

    move-result-object v1

    iget-object v2, p0, Lsa/n;->h:Lcom/google/android/gms/maps/GoogleMapOptions;

    invoke-interface {v0, v1, v2}, Lta/e0;->B1(Lcom/google/android/gms/dynamic/b;Lcom/google/android/gms/maps/GoogleMapOptions;)Lta/c;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lsa/n;->g:Lcom/google/android/gms/dynamic/e;

    new-instance v2, Lsa/m;

    iget-object v3, p0, Lsa/n;->e:Landroid/view/ViewGroup;

    invoke-direct {v2, v3, v0}, Lsa/m;-><init>(Landroid/view/ViewGroup;Lta/c;)V

    invoke-interface {v1, v2}, Lcom/google/android/gms/dynamic/e;->a(Lcom/google/android/gms/dynamic/c;)V

    iget-object v0, p0, Lsa/n;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsa/f;

    invoke-virtual {p0}, Lcom/google/android/gms/dynamic/a;->b()Lcom/google/android/gms/dynamic/c;

    move-result-object v2

    check-cast v2, Lsa/m;

    invoke-virtual {v2, v1}, Lsa/m;->a(Lsa/f;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lsa/n;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lca/h; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void

    :catch_1
    move-exception v0

    new-instance v1, Lua/v;

    invoke-direct {v1, v0}, Lua/v;-><init>(Landroid/os/RemoteException;)V

    throw v1

    :cond_2
    return-void
.end method
