.class public Lql/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lql/y$a;,
        Lql/y$b;
    }
.end annotation


# static fields
.field public static final O:Lql/y$b;

.field private static final P:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lql/z;",
            ">;"
        }
    .end annotation
.end field

.field private static final Q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lql/l;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final A:Ljavax/net/ssl/SSLSocketFactory;

.field private final B:Ljavax/net/ssl/X509TrustManager;

.field private final C:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lql/l;",
            ">;"
        }
    .end annotation
.end field

.field private final D:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lql/z;",
            ">;"
        }
    .end annotation
.end field

.field private final E:Ljavax/net/ssl/HostnameVerifier;

.field private final F:Lql/g;

.field private final G:Lcm/c;

.field private final H:I

.field private final I:I

.field private final J:I

.field private final K:I

.field private final L:I

.field private final M:J

.field private final N:Lvl/h;

.field private final a:Lql/p;

.field private final b:Lql/k;

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lql/v;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lql/v;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lql/r$c;

.field private final f:Z

.field private final r:Lql/b;

.field private final s:Z

.field private final t:Z

.field private final u:Lql/n;

.field private final v:Lql/q;

.field private final w:Ljava/net/Proxy;

.field private final x:Ljava/net/ProxySelector;

.field private final y:Lql/b;

.field private final z:Ljavax/net/SocketFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lql/y$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lql/y$b;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lql/y;->O:Lql/y$b;

    const/4 v0, 0x2

    new-array v1, v0, [Lql/z;

    sget-object v2, Lql/z;->HTTP_2:Lql/z;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Lql/z;->HTTP_1_1:Lql/z;

    const/4 v4, 0x1

    aput-object v2, v1, v4

    invoke-static {v1}, Lrl/d;->w([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sput-object v1, Lql/y;->P:Ljava/util/List;

    new-array v0, v0, [Lql/l;

    sget-object v1, Lql/l;->i:Lql/l;

    aput-object v1, v0, v3

    sget-object v1, Lql/l;->k:Lql/l;

    aput-object v1, v0, v4

    invoke-static {v0}, Lrl/d;->w([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lql/y;->Q:Ljava/util/List;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    new-instance v0, Lql/y$a;

    invoke-direct {v0}, Lql/y$a;-><init>()V

    invoke-direct {p0, v0}, Lql/y;-><init>(Lql/y$a;)V

    return-void
.end method

.method public constructor <init>(Lql/y$a;)V
    .locals 3

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lql/y$a;->l()Lql/p;

    move-result-object v0

    iput-object v0, p0, Lql/y;->a:Lql/p;

    invoke-virtual {p1}, Lql/y$a;->i()Lql/k;

    move-result-object v0

    iput-object v0, p0, Lql/y;->b:Lql/k;

    invoke-virtual {p1}, Lql/y$a;->r()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lrl/d;->S(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lql/y;->c:Ljava/util/List;

    invoke-virtual {p1}, Lql/y$a;->t()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lrl/d;->S(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lql/y;->d:Ljava/util/List;

    invoke-virtual {p1}, Lql/y$a;->n()Lql/r$c;

    move-result-object v0

    iput-object v0, p0, Lql/y;->e:Lql/r$c;

    invoke-virtual {p1}, Lql/y$a;->A()Z

    move-result v0

    iput-boolean v0, p0, Lql/y;->f:Z

    invoke-virtual {p1}, Lql/y$a;->c()Lql/b;

    move-result-object v0

    iput-object v0, p0, Lql/y;->r:Lql/b;

    invoke-virtual {p1}, Lql/y$a;->o()Z

    move-result v0

    iput-boolean v0, p0, Lql/y;->s:Z

    invoke-virtual {p1}, Lql/y$a;->p()Z

    move-result v0

    iput-boolean v0, p0, Lql/y;->t:Z

    invoke-virtual {p1}, Lql/y$a;->k()Lql/n;

    move-result-object v0

    iput-object v0, p0, Lql/y;->u:Lql/n;

    invoke-virtual {p1}, Lql/y$a;->d()Lql/c;

    invoke-virtual {p1}, Lql/y$a;->m()Lql/q;

    move-result-object v0

    iput-object v0, p0, Lql/y;->v:Lql/q;

    invoke-virtual {p1}, Lql/y$a;->w()Ljava/net/Proxy;

    move-result-object v0

    iput-object v0, p0, Lql/y;->w:Ljava/net/Proxy;

    invoke-virtual {p1}, Lql/y$a;->w()Ljava/net/Proxy;

    move-result-object v0

    if-eqz v0, :cond_0

    :goto_0
    sget-object v0, Lbm/a;->a:Lbm/a;

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lql/y$a;->y()Ljava/net/ProxySelector;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {}, Ljava/net/ProxySelector;->getDefault()Ljava/net/ProxySelector;

    move-result-object v0

    :cond_1
    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    :goto_1
    iput-object v0, p0, Lql/y;->x:Ljava/net/ProxySelector;

    invoke-virtual {p1}, Lql/y$a;->x()Lql/b;

    move-result-object v0

    iput-object v0, p0, Lql/y;->y:Lql/b;

    invoke-virtual {p1}, Lql/y$a;->C()Ljavax/net/SocketFactory;

    move-result-object v0

    iput-object v0, p0, Lql/y;->z:Ljavax/net/SocketFactory;

    invoke-virtual {p1}, Lql/y$a;->j()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lql/y;->C:Ljava/util/List;

    invoke-virtual {p1}, Lql/y$a;->v()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lql/y;->D:Ljava/util/List;

    invoke-virtual {p1}, Lql/y$a;->q()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v1

    iput-object v1, p0, Lql/y;->E:Ljavax/net/ssl/HostnameVerifier;

    invoke-virtual {p1}, Lql/y$a;->e()I

    move-result v1

    iput v1, p0, Lql/y;->H:I

    invoke-virtual {p1}, Lql/y$a;->h()I

    move-result v1

    iput v1, p0, Lql/y;->I:I

    invoke-virtual {p1}, Lql/y$a;->z()I

    move-result v1

    iput v1, p0, Lql/y;->J:I

    invoke-virtual {p1}, Lql/y$a;->E()I

    move-result v1

    iput v1, p0, Lql/y;->K:I

    invoke-virtual {p1}, Lql/y$a;->u()I

    move-result v1

    iput v1, p0, Lql/y;->L:I

    invoke-virtual {p1}, Lql/y$a;->s()J

    move-result-wide v1

    iput-wide v1, p0, Lql/y;->M:J

    invoke-virtual {p1}, Lql/y$a;->B()Lvl/h;

    move-result-object v1

    if-nez v1, :cond_3

    new-instance v1, Lvl/h;

    invoke-direct {v1}, Lvl/h;-><init>()V

    :cond_3
    iput-object v1, p0, Lql/y;->N:Lvl/h;

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    const/4 v2, 0x1

    if-eqz v1, :cond_4

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lql/l;

    invoke-virtual {v1}, Lql/l;->f()Z

    move-result v1

    if-eqz v1, :cond_5

    const/4 v2, 0x0

    :cond_6
    :goto_2
    if-eqz v2, :cond_7

    const/4 p1, 0x0

    iput-object p1, p0, Lql/y;->A:Ljavax/net/ssl/SSLSocketFactory;

    iput-object p1, p0, Lql/y;->G:Lcm/c;

    iput-object p1, p0, Lql/y;->B:Ljavax/net/ssl/X509TrustManager;

    sget-object p1, Lql/g;->d:Lql/g;

    :goto_3
    iput-object p1, p0, Lql/y;->F:Lql/g;

    goto :goto_5

    :cond_7
    invoke-virtual {p1}, Lql/y$a;->D()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {p1}, Lql/y$a;->D()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    iput-object v0, p0, Lql/y;->A:Ljavax/net/ssl/SSLSocketFactory;

    invoke-virtual {p1}, Lql/y$a;->f()Lcm/c;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    iput-object v0, p0, Lql/y;->G:Lcm/c;

    invoke-virtual {p1}, Lql/y$a;->F()Ljavax/net/ssl/X509TrustManager;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    iput-object v1, p0, Lql/y;->B:Ljavax/net/ssl/X509TrustManager;

    goto :goto_4

    :cond_8
    sget-object v0, Lzl/j;->a:Lzl/j$a;

    invoke-virtual {v0}, Lzl/j$a;->g()Lzl/j;

    move-result-object v1

    invoke-virtual {v1}, Lzl/j;->o()Ljavax/net/ssl/X509TrustManager;

    move-result-object v1

    iput-object v1, p0, Lql/y;->B:Ljavax/net/ssl/X509TrustManager;

    invoke-virtual {v0}, Lzl/j$a;->g()Lzl/j;

    move-result-object v0

    invoke-static {v1}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lzl/j;->n(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    iput-object v0, p0, Lql/y;->A:Ljavax/net/ssl/SSLSocketFactory;

    sget-object v0, Lcm/c;->a:Lcm/c$a;

    invoke-static {v1}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lcm/c$a;->a(Ljavax/net/ssl/X509TrustManager;)Lcm/c;

    move-result-object v0

    iput-object v0, p0, Lql/y;->G:Lcm/c;

    :goto_4
    invoke-virtual {p1}, Lql/y$a;->g()Lql/g;

    move-result-object p1

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Lql/g;->e(Lcm/c;)Lql/g;

    move-result-object p1

    goto :goto_3

    :goto_5
    invoke-direct {p0}, Lql/y;->H()V

    return-void
.end method

.method private final H()V
    .locals 4

    iget-object v0, p0, Lql/y;->c:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x1

    xor-int/2addr v0, v2

    if-eqz v0, :cond_f

    iget-object v0, p0, Lql/y;->d:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    xor-int/2addr v0, v2

    if-eqz v0, :cond_e

    iget-object v0, p0, Lql/y;->C:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lql/l;

    invoke-virtual {v1}, Lql/l;->f()Z

    move-result v1

    if-eqz v1, :cond_2

    move v0, v3

    :goto_0
    if-eqz v0, :cond_a

    iget-object v0, p0, Lql/y;->A:Ljavax/net/ssl/SSLSocketFactory;

    if-nez v0, :cond_3

    move v0, v2

    goto :goto_1

    :cond_3
    move v0, v3

    :goto_1
    const-string v1, "Check failed."

    if-eqz v0, :cond_9

    iget-object v0, p0, Lql/y;->G:Lcm/c;

    if-nez v0, :cond_4

    move v0, v2

    goto :goto_2

    :cond_4
    move v0, v3

    :goto_2
    if-eqz v0, :cond_8

    iget-object v0, p0, Lql/y;->B:Ljavax/net/ssl/X509TrustManager;

    if-nez v0, :cond_5

    goto :goto_3

    :cond_5
    move v2, v3

    :goto_3
    if-eqz v2, :cond_7

    iget-object v0, p0, Lql/y;->F:Lql/g;

    sget-object v2, Lql/g;->d:Lql/g;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_4

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    iget-object v0, p0, Lql/y;->A:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v0, :cond_d

    iget-object v0, p0, Lql/y;->G:Lcm/c;

    if-eqz v0, :cond_c

    iget-object v0, p0, Lql/y;->B:Ljavax/net/ssl/X509TrustManager;

    if-eqz v0, :cond_b

    :goto_4
    return-void

    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "x509TrustManager == null"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "certificateChainCleaner == null"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "sslSocketFactory == null"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    const-string v0, "Null network interceptor: "

    invoke-virtual {p0}, Lql/y;->v()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_f
    const-string v0, "Null interceptor: "

    invoke-virtual {p0}, Lql/y;->u()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static final synthetic a()Ljava/util/List;
    .locals 1

    sget-object v0, Lql/y;->Q:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic b()Ljava/util/List;
    .locals 1

    sget-object v0, Lql/y;->P:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public final A()Ljava/net/Proxy;
    .locals 1

    iget-object v0, p0, Lql/y;->w:Ljava/net/Proxy;

    return-object v0
.end method

.method public final B()Lql/b;
    .locals 1

    iget-object v0, p0, Lql/y;->y:Lql/b;

    return-object v0
.end method

.method public final C()Ljava/net/ProxySelector;
    .locals 1

    iget-object v0, p0, Lql/y;->x:Ljava/net/ProxySelector;

    return-object v0
.end method

.method public final D()I
    .locals 1

    iget v0, p0, Lql/y;->J:I

    return v0
.end method

.method public final E()Z
    .locals 1

    iget-boolean v0, p0, Lql/y;->f:Z

    return v0
.end method

.method public final F()Ljavax/net/SocketFactory;
    .locals 1

    iget-object v0, p0, Lql/y;->z:Ljavax/net/SocketFactory;

    return-object v0
.end method

.method public final G()Ljavax/net/ssl/SSLSocketFactory;
    .locals 2

    iget-object v0, p0, Lql/y;->A:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "CLEARTEXT-only client"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final I()I
    .locals 1

    iget v0, p0, Lql/y;->K:I

    return v0
.end method

.method public final c()Lql/b;
    .locals 1

    iget-object v0, p0, Lql/y;->r:Lql/b;

    return-object v0
.end method

.method public clone()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final d()Lql/c;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lql/y;->H:I

    return v0
.end method

.method public final g()Lql/g;
    .locals 1

    iget-object v0, p0, Lql/y;->F:Lql/g;

    return-object v0
.end method

.method public final h()I
    .locals 1

    iget v0, p0, Lql/y;->I:I

    return v0
.end method

.method public final i()Lql/k;
    .locals 1

    iget-object v0, p0, Lql/y;->b:Lql/k;

    return-object v0
.end method

.method public final j()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lql/l;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lql/y;->C:Ljava/util/List;

    return-object v0
.end method

.method public final k()Lql/n;
    .locals 1

    iget-object v0, p0, Lql/y;->u:Lql/n;

    return-object v0
.end method

.method public final l()Lql/p;
    .locals 1

    iget-object v0, p0, Lql/y;->a:Lql/p;

    return-object v0
.end method

.method public final m()Lql/q;
    .locals 1

    iget-object v0, p0, Lql/y;->v:Lql/q;

    return-object v0
.end method

.method public final p()Lql/r$c;
    .locals 1

    iget-object v0, p0, Lql/y;->e:Lql/r$c;

    return-object v0
.end method

.method public final q()Z
    .locals 1

    iget-boolean v0, p0, Lql/y;->s:Z

    return v0
.end method

.method public final r()Z
    .locals 1

    iget-boolean v0, p0, Lql/y;->t:Z

    return v0
.end method

.method public final s()Lvl/h;
    .locals 1

    iget-object v0, p0, Lql/y;->N:Lvl/h;

    return-object v0
.end method

.method public final t()Ljavax/net/ssl/HostnameVerifier;
    .locals 1

    iget-object v0, p0, Lql/y;->E:Ljavax/net/ssl/HostnameVerifier;

    return-object v0
.end method

.method public final u()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lql/v;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lql/y;->c:Ljava/util/List;

    return-object v0
.end method

.method public final v()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lql/v;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lql/y;->d:Ljava/util/List;

    return-object v0
.end method

.method public w(Lql/a0;)Lql/e;
    .locals 2

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lvl/e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lvl/e;-><init>(Lql/y;Lql/a0;Z)V

    return-object v0
.end method

.method public final x()I
    .locals 1

    iget v0, p0, Lql/y;->L:I

    return v0
.end method

.method public final z()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lql/z;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lql/y;->D:Ljava/util/List;

    return-object v0
.end method
