.class public final Lcom/google/android/gms/ads/internal/client/d3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/zzbsr;

.field private final b:Lcom/google/android/gms/ads/internal/client/y4;

.field private final c:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final d:Lx8/b0;

.field final e:Lcom/google/android/gms/ads/internal/client/y;

.field private f:Lcom/google/android/gms/ads/internal/client/a;

.field private g:Lx8/e;

.field private h:[Lx8/i;

.field private i:Ly8/e;

.field private j:Lcom/google/android/gms/ads/internal/client/u0;

.field private k:Lx8/c0;

.field private l:Ljava/lang/String;

.field private final m:Landroid/view/ViewGroup;

.field private n:I

.field private o:Z

.field private p:Lx8/t;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;I)V
    .locals 7

    const/4 v2, 0x0

    const/4 v3, 0x0

    sget-object v4, Lcom/google/android/gms/ads/internal/client/y4;->a:Lcom/google/android/gms/ads/internal/client/y4;

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/ads/internal/client/d3;-><init>(Landroid/view/ViewGroup;Landroid/util/AttributeSet;ZLcom/google/android/gms/ads/internal/client/y4;Lcom/google/android/gms/ads/internal/client/u0;I)V

    return-void
.end method

.method constructor <init>(Landroid/view/ViewGroup;Landroid/util/AttributeSet;ZLcom/google/android/gms/ads/internal/client/y4;Lcom/google/android/gms/ads/internal/client/u0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p5, Lcom/google/android/gms/internal/ads/zzbsr;

    invoke-direct {p5}, Lcom/google/android/gms/internal/ads/zzbsr;-><init>()V

    iput-object p5, p0, Lcom/google/android/gms/ads/internal/client/d3;->a:Lcom/google/android/gms/internal/ads/zzbsr;

    new-instance p5, Lx8/b0;

    invoke-direct {p5}, Lx8/b0;-><init>()V

    iput-object p5, p0, Lcom/google/android/gms/ads/internal/client/d3;->d:Lx8/b0;

    new-instance p5, Lcom/google/android/gms/ads/internal/client/b3;

    invoke-direct {p5, p0}, Lcom/google/android/gms/ads/internal/client/b3;-><init>(Lcom/google/android/gms/ads/internal/client/d3;)V

    iput-object p5, p0, Lcom/google/android/gms/ads/internal/client/d3;->e:Lcom/google/android/gms/ads/internal/client/y;

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/d3;->m:Landroid/view/ViewGroup;

    iput-object p4, p0, Lcom/google/android/gms/ads/internal/client/d3;->b:Lcom/google/android/gms/ads/internal/client/y4;

    const/4 p4, 0x0

    iput-object p4, p0, Lcom/google/android/gms/ads/internal/client/d3;->j:Lcom/google/android/gms/ads/internal/client/u0;

    new-instance p4, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p5, 0x0

    invoke-direct {p4, p5}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p4, p0, Lcom/google/android/gms/ads/internal/client/d3;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput p6, p0, Lcom/google/android/gms/ads/internal/client/d3;->n:I

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p4

    :try_start_0
    new-instance p6, Lcom/google/android/gms/ads/internal/client/h5;

    invoke-direct {p6, p4, p2}, Lcom/google/android/gms/ads/internal/client/h5;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-virtual {p6, p3}, Lcom/google/android/gms/ads/internal/client/h5;->b(Z)[Lx8/i;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/client/d3;->h:[Lx8/i;

    invoke-virtual {p6}, Lcom/google/android/gms/ads/internal/client/h5;->a()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/client/d3;->l:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p1}, Landroid/view/View;->isInEditMode()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/x;->b()Lcom/google/android/gms/internal/ads/zzcdv;

    move-result-object p2

    iget-object p3, p0, Lcom/google/android/gms/ads/internal/client/d3;->h:[Lx8/i;

    aget-object p3, p3, p5

    iget p5, p0, Lcom/google/android/gms/ads/internal/client/d3;->n:I

    sget-object p6, Lx8/i;->q:Lx8/i;

    invoke-virtual {p3, p6}, Lx8/i;->equals(Ljava/lang/Object;)Z

    move-result p6

    if-eqz p6, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/z4;->y1()Lcom/google/android/gms/ads/internal/client/z4;

    move-result-object p3

    goto :goto_0

    :cond_0
    new-instance p6, Lcom/google/android/gms/ads/internal/client/z4;

    invoke-direct {p6, p4, p3}, Lcom/google/android/gms/ads/internal/client/z4;-><init>(Landroid/content/Context;Lx8/i;)V

    invoke-static {p5}, Lcom/google/android/gms/ads/internal/client/d3;->c(I)Z

    move-result p3

    iput-boolean p3, p6, Lcom/google/android/gms/ads/internal/client/z4;->u:Z

    move-object p3, p6

    :goto_0
    const-string p4, "Ads by Google"

    invoke-virtual {p2, p1, p3, p4}, Lcom/google/android/gms/internal/ads/zzcdv;->zzm(Landroid/view/ViewGroup;Lcom/google/android/gms/ads/internal/client/z4;Ljava/lang/String;)V

    return-void

    :catch_0
    move-exception p2

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/x;->b()Lcom/google/android/gms/internal/ads/zzcdv;

    move-result-object p3

    new-instance p5, Lcom/google/android/gms/ads/internal/client/z4;

    sget-object p6, Lx8/i;->i:Lx8/i;

    invoke-direct {p5, p4, p6}, Lcom/google/android/gms/ads/internal/client/z4;-><init>(Landroid/content/Context;Lx8/i;)V

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p1, p5, p4, p2}, Lcom/google/android/gms/internal/ads/zzcdv;->zzl(Landroid/view/ViewGroup;Lcom/google/android/gms/ads/internal/client/z4;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method private static b(Landroid/content/Context;[Lx8/i;I)Lcom/google/android/gms/ads/internal/client/z4;
    .locals 4

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p1, v1

    sget-object v3, Lx8/i;->q:Lx8/i;

    invoke-virtual {v2, v3}, Lx8/i;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/z4;->y1()Lcom/google/android/gms/ads/internal/client/z4;

    move-result-object p0

    return-object p0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/google/android/gms/ads/internal/client/z4;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/ads/internal/client/z4;-><init>(Landroid/content/Context;[Lx8/i;)V

    invoke-static {p2}, Lcom/google/android/gms/ads/internal/client/d3;->c(I)Z

    move-result p0

    iput-boolean p0, v0, Lcom/google/android/gms/ads/internal/client/z4;->u:Z

    return-object v0
.end method

.method private static c(I)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    return v0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method static bridge synthetic h(Lcom/google/android/gms/ads/internal/client/d3;)Lx8/b0;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/ads/internal/client/d3;->d:Lx8/b0;

    return-object p0
.end method


# virtual methods
.method public final A(Lx8/c0;)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/d3;->k:Lx8/c0;

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/d3;->j:Lcom/google/android/gms/ads/internal/client/u0;

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/google/android/gms/ads/internal/client/n4;

    invoke-direct {v1, p1}, Lcom/google/android/gms/ads/internal/client/n4;-><init>(Lx8/c0;)V

    move-object p1, v1

    :goto_0
    invoke-interface {v0, p1}, Lcom/google/android/gms/ads/internal/client/u0;->zzU(Lcom/google/android/gms/ads/internal/client/n4;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return-void

    :catch_0
    move-exception p1

    const-string v0, "#007 Could not call remote method."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzcec;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final B(Lcom/google/android/gms/ads/internal/client/u0;)Z
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    invoke-interface {p1}, Lcom/google/android/gms/ads/internal/client/u0;->zzn()Lcom/google/android/gms/dynamic/b;

    move-result-object v1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lcom/google/android/gms/dynamic/d;->g2(Lcom/google/android/gms/dynamic/b;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-nez v2, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/d3;->m:Landroid/view/ViewGroup;

    invoke-static {v1}, Lcom/google/android/gms/dynamic/d;->g2(Lcom/google/android/gms/dynamic/b;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/d3;->j:Lcom/google/android/gms/ads/internal/client/u0;

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    return v0

    :catch_0
    move-exception p1

    const-string v1, "#007 Could not call remote method."

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/ads/zzcec;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    return v0
.end method

.method public final a()[Lx8/i;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/d3;->h:[Lx8/i;

    return-object v0
.end method

.method public final d()Lx8/e;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/d3;->g:Lx8/e;

    return-object v0
.end method

.method public final e()Lx8/i;
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/d3;->j:Lcom/google/android/gms/ads/internal/client/u0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/client/u0;->zzg()Lcom/google/android/gms/ads/internal/client/z4;

    move-result-object v0

    if-eqz v0, :cond_0

    iget v1, v0, Lcom/google/android/gms/ads/internal/client/z4;->e:I

    iget v2, v0, Lcom/google/android/gms/ads/internal/client/z4;->b:I

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/client/z4;->a:Ljava/lang/String;

    invoke-static {v1, v2, v0}, Lx8/e0;->c(IILjava/lang/String;)Lx8/i;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "#007 Could not call remote method."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzcec;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/d3;->h:[Lx8/i;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    aget-object v0, v0, v1

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final f()Lx8/t;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/d3;->p:Lx8/t;

    return-object v0
.end method

.method public final g()Lx8/z;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/d3;->j:Lcom/google/android/gms/ads/internal/client/u0;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lcom/google/android/gms/ads/internal/client/u0;->zzk()Lcom/google/android/gms/ads/internal/client/p2;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "#007 Could not call remote method."

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/zzcec;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    invoke-static {v0}, Lx8/z;->f(Lcom/google/android/gms/ads/internal/client/p2;)Lx8/z;

    move-result-object v0

    return-object v0
.end method

.method public final i()Lx8/b0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/d3;->d:Lx8/b0;

    return-object v0
.end method

.method public final j()Lx8/c0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/d3;->k:Lx8/c0;

    return-object v0
.end method

.method public final k()Ly8/e;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/d3;->i:Ly8/e;

    return-object v0
.end method

.method public final l()Lcom/google/android/gms/ads/internal/client/s2;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/d3;->j:Lcom/google/android/gms/ads/internal/client/u0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/client/u0;->zzl()Lcom/google/android/gms/ads/internal/client/s2;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const-string v2, "#007 Could not call remote method."

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/zzcec;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-object v1
.end method

.method public final m()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/d3;->l:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/d3;->j:Lcom/google/android/gms/ads/internal/client/u0;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/client/u0;->zzr()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/client/d3;->l:Ljava/lang/String;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "#007 Could not call remote method."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzcec;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/d3;->l:Ljava/lang/String;

    return-object v0
.end method

.method public final n()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/d3;->j:Lcom/google/android/gms/ads/internal/client/u0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/client/u0;->zzx()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "#007 Could not call remote method."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzcec;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method final synthetic o(Lcom/google/android/gms/dynamic/b;)V
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/dynamic/d;->g2(Lcom/google/android/gms/dynamic/b;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/d3;->m:Landroid/view/ViewGroup;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method public final p(Lcom/google/android/gms/ads/internal/client/z2;)V
    .locals 10

    const-string v0, "#007 Could not call remote method."

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/d3;->j:Lcom/google/android/gms/ads/internal/client/u0;

    if-nez v1, :cond_7

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/d3;->h:[Lx8/i;

    if-eqz v1, :cond_6

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/d3;->l:Ljava/lang/String;

    if-eqz v1, :cond_6

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/d3;->m:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/client/d3;->h:[Lx8/i;

    iget v3, p0, Lcom/google/android/gms/ads/internal/client/d3;->n:I

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/ads/internal/client/d3;->b(Landroid/content/Context;[Lx8/i;I)Lcom/google/android/gms/ads/internal/client/z4;

    move-result-object v5

    const-string v2, "search_v2"

    iget-object v3, v5, Lcom/google/android/gms/ads/internal/client/z4;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v8, 0x0

    if-eqz v2, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/x;->a()Lcom/google/android/gms/ads/internal/client/v;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/client/d3;->l:Ljava/lang/String;

    new-instance v4, Lcom/google/android/gms/ads/internal/client/m;

    invoke-direct {v4, v2, v1, v5, v3}, Lcom/google/android/gms/ads/internal/client/m;-><init>(Lcom/google/android/gms/ads/internal/client/v;Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/z4;Ljava/lang/String;)V

    invoke-virtual {v4, v1, v8}, Lcom/google/android/gms/ads/internal/client/w;->d(Landroid/content/Context;Z)Ljava/lang/Object;

    move-result-object v1

    :goto_0
    check-cast v1, Lcom/google/android/gms/ads/internal/client/u0;

    goto :goto_1

    :cond_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/x;->a()Lcom/google/android/gms/ads/internal/client/v;

    move-result-object v3

    iget-object v6, p0, Lcom/google/android/gms/ads/internal/client/d3;->l:Ljava/lang/String;

    iget-object v7, p0, Lcom/google/android/gms/ads/internal/client/d3;->a:Lcom/google/android/gms/internal/ads/zzbsr;

    new-instance v9, Lcom/google/android/gms/ads/internal/client/k;

    move-object v2, v9

    move-object v4, v1

    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/ads/internal/client/k;-><init>(Lcom/google/android/gms/ads/internal/client/v;Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/z4;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbsv;)V

    invoke-virtual {v9, v1, v8}, Lcom/google/android/gms/ads/internal/client/w;->d(Landroid/content/Context;Z)Ljava/lang/Object;

    move-result-object v1

    goto :goto_0

    :goto_1
    iput-object v1, p0, Lcom/google/android/gms/ads/internal/client/d3;->j:Lcom/google/android/gms/ads/internal/client/u0;

    new-instance v2, Lcom/google/android/gms/ads/internal/client/p4;

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/client/d3;->e:Lcom/google/android/gms/ads/internal/client/y;

    invoke-direct {v2, v3}, Lcom/google/android/gms/ads/internal/client/p4;-><init>(Lx8/e;)V

    invoke-interface {v1, v2}, Lcom/google/android/gms/ads/internal/client/u0;->zzD(Lcom/google/android/gms/ads/internal/client/h0;)V

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/d3;->f:Lcom/google/android/gms/ads/internal/client/a;

    if-eqz v1, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/client/d3;->j:Lcom/google/android/gms/ads/internal/client/u0;

    new-instance v3, Lcom/google/android/gms/ads/internal/client/z;

    invoke-direct {v3, v1}, Lcom/google/android/gms/ads/internal/client/z;-><init>(Lcom/google/android/gms/ads/internal/client/a;)V

    invoke-interface {v2, v3}, Lcom/google/android/gms/ads/internal/client/u0;->zzC(Lcom/google/android/gms/ads/internal/client/e0;)V

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/d3;->i:Ly8/e;

    if-eqz v1, :cond_2

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/client/d3;->j:Lcom/google/android/gms/ads/internal/client/u0;

    new-instance v3, Lcom/google/android/gms/internal/ads/zzaze;

    invoke-direct {v3, v1}, Lcom/google/android/gms/internal/ads/zzaze;-><init>(Ly8/e;)V

    invoke-interface {v2, v3}, Lcom/google/android/gms/ads/internal/client/u0;->zzG(Lcom/google/android/gms/ads/internal/client/c1;)V

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/d3;->k:Lx8/c0;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/d3;->j:Lcom/google/android/gms/ads/internal/client/u0;

    new-instance v2, Lcom/google/android/gms/ads/internal/client/n4;

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/client/d3;->k:Lx8/c0;

    invoke-direct {v2, v3}, Lcom/google/android/gms/ads/internal/client/n4;-><init>(Lx8/c0;)V

    invoke-interface {v1, v2}, Lcom/google/android/gms/ads/internal/client/u0;->zzU(Lcom/google/android/gms/ads/internal/client/n4;)V

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/d3;->j:Lcom/google/android/gms/ads/internal/client/u0;

    new-instance v2, Lcom/google/android/gms/ads/internal/client/h4;

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/client/d3;->p:Lx8/t;

    invoke-direct {v2, v3}, Lcom/google/android/gms/ads/internal/client/h4;-><init>(Lx8/t;)V

    invoke-interface {v1, v2}, Lcom/google/android/gms/ads/internal/client/u0;->zzP(Lcom/google/android/gms/ads/internal/client/i2;)V

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/d3;->j:Lcom/google/android/gms/ads/internal/client/u0;

    iget-boolean v2, p0, Lcom/google/android/gms/ads/internal/client/d3;->o:Z

    invoke-interface {v1, v2}, Lcom/google/android/gms/ads/internal/client/u0;->zzN(Z)V

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/d3;->j:Lcom/google/android/gms/ads/internal/client/u0;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1

    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    :try_start_1
    invoke-interface {v1}, Lcom/google/android/gms/ads/internal/client/u0;->zzn()Lcom/google/android/gms/dynamic/b;

    move-result-object v1

    if-eqz v1, :cond_7

    sget-object v2, Lcom/google/android/gms/internal/ads/zzbhy;->zzf:Lcom/google/android/gms/internal/ads/zzbhm;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzbhm;->zze()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_5

    sget-object v2, Lcom/google/android/gms/internal/ads/zzbgc;->zzkG:Lcom/google/android/gms/internal/ads/zzbfu;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/a0;->c()Lcom/google/android/gms/internal/ads/zzbga;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/zzbga;->zza(Lcom/google/android/gms/internal/ads/zzbfu;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_5

    sget-object v2, Lcom/google/android/gms/internal/ads/zzcdv;->zza:Landroid/os/Handler;

    new-instance v3, Lcom/google/android/gms/ads/internal/client/a3;

    invoke-direct {v3, p0, v1}, Lcom/google/android/gms/ads/internal/client/a3;-><init>(Lcom/google/android/gms/ads/internal/client/d3;Lcom/google/android/gms/dynamic/b;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_2

    :cond_5
    iget-object v2, p0, Lcom/google/android/gms/ads/internal/client/d3;->m:Landroid/view/ViewGroup;

    invoke-static {v1}, Lcom/google/android/gms/dynamic/d;->g2(Lcom/google/android/gms/dynamic/b;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception v1

    :try_start_2
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzcec;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "The ad size and ad unit ID must be set before loadAd is called."

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    :goto_2
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/d3;->j:Lcom/google/android/gms/ads/internal/client/u0;
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_3
    iget-object v2, p0, Lcom/google/android/gms/ads/internal/client/d3;->b:Lcom/google/android/gms/ads/internal/client/y4;

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/client/d3;->m:Landroid/view/ViewGroup;

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v2, v3, p1}, Lcom/google/android/gms/ads/internal/client/y4;->a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/z2;)Lcom/google/android/gms/ads/internal/client/u4;

    move-result-object p1

    invoke-interface {v1, p1}, Lcom/google/android/gms/ads/internal/client/u0;->zzaa(Lcom/google/android/gms/ads/internal/client/u4;)Z
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_1

    return-void

    :catch_1
    move-exception p1

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzcec;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final q()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/d3;->j:Lcom/google/android/gms/ads/internal/client/u0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/client/u0;->zzz()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "#007 Could not call remote method."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzcec;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final r()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/d3;->j:Lcom/google/android/gms/ads/internal/client/u0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/client/u0;->zzB()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "#007 Could not call remote method."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzcec;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final s(Lcom/google/android/gms/ads/internal/client/a;)V
    .locals 2

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/d3;->f:Lcom/google/android/gms/ads/internal/client/a;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/d3;->j:Lcom/google/android/gms/ads/internal/client/u0;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    new-instance v1, Lcom/google/android/gms/ads/internal/client/z;

    invoke-direct {v1, p1}, Lcom/google/android/gms/ads/internal/client/z;-><init>(Lcom/google/android/gms/ads/internal/client/a;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/internal/client/u0;->zzC(Lcom/google/android/gms/ads/internal/client/e0;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return-void

    :catch_0
    move-exception p1

    const-string v0, "#007 Could not call remote method."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzcec;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final t(Lx8/e;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/d3;->g:Lx8/e;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/d3;->e:Lcom/google/android/gms/ads/internal/client/y;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/y;->d(Lx8/e;)V

    return-void
.end method

.method public final varargs u([Lx8/i;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/d3;->h:[Lx8/i;

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/ads/internal/client/d3;->v([Lx8/i;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "The ad size can only be set once on AdView."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final varargs v([Lx8/i;)V
    .locals 3

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/d3;->h:[Lx8/i;

    :try_start_0
    iget-object p1, p0, Lcom/google/android/gms/ads/internal/client/d3;->j:Lcom/google/android/gms/ads/internal/client/u0;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/d3;->m:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/d3;->h:[Lx8/i;

    iget v2, p0, Lcom/google/android/gms/ads/internal/client/d3;->n:I

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/ads/internal/client/d3;->b(Landroid/content/Context;[Lx8/i;I)Lcom/google/android/gms/ads/internal/client/z4;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/google/android/gms/ads/internal/client/u0;->zzF(Lcom/google/android/gms/ads/internal/client/z4;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "#007 Could not call remote method."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzcec;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/ads/internal/client/d3;->m:Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public final w(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/d3;->l:Ljava/lang/String;

    if-nez v0, :cond_0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/d3;->l:Ljava/lang/String;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "The ad unit ID can only be set once on AdView."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final x(Ly8/e;)V
    .locals 2

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/d3;->i:Ly8/e;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/d3;->j:Lcom/google/android/gms/ads/internal/client/u0;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/ads/zzaze;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/zzaze;-><init>(Ly8/e;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/internal/client/u0;->zzG(Lcom/google/android/gms/ads/internal/client/c1;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return-void

    :catch_0
    move-exception p1

    const-string v0, "#007 Could not call remote method."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzcec;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final y(Z)V
    .locals 1

    iput-boolean p1, p0, Lcom/google/android/gms/ads/internal/client/d3;->o:Z

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/d3;->j:Lcom/google/android/gms/ads/internal/client/u0;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/google/android/gms/ads/internal/client/u0;->zzN(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception p1

    const-string v0, "#007 Could not call remote method."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzcec;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final z(Lx8/t;)V
    .locals 2

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/d3;->p:Lx8/t;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/d3;->j:Lcom/google/android/gms/ads/internal/client/u0;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/google/android/gms/ads/internal/client/h4;

    invoke-direct {v1, p1}, Lcom/google/android/gms/ads/internal/client/h4;-><init>(Lx8/t;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/internal/client/u0;->zzP(Lcom/google/android/gms/ads/internal/client/i2;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception p1

    const-string v0, "#007 Could not call remote method."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzcec;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
