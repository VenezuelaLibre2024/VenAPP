.class public final Lql/y$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lql/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private A:I

.field private B:J

.field private C:Lvl/h;

.field private a:Lql/p;

.field private b:Lql/k;

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

.field private e:Lql/r$c;

.field private f:Z

.field private g:Lql/b;

.field private h:Z

.field private i:Z

.field private j:Lql/n;

.field private k:Lql/q;

.field private l:Ljava/net/Proxy;

.field private m:Ljava/net/ProxySelector;

.field private n:Lql/b;

.field private o:Ljavax/net/SocketFactory;

.field private p:Ljavax/net/ssl/SSLSocketFactory;

.field private q:Ljavax/net/ssl/X509TrustManager;

.field private r:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lql/l;",
            ">;"
        }
    .end annotation
.end field

.field private s:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lql/z;",
            ">;"
        }
    .end annotation
.end field

.field private t:Ljavax/net/ssl/HostnameVerifier;

.field private u:Lql/g;

.field private v:Lcm/c;

.field private w:I

.field private x:I

.field private y:I

.field private z:I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lql/p;

    invoke-direct {v0}, Lql/p;-><init>()V

    iput-object v0, p0, Lql/y$a;->a:Lql/p;

    new-instance v0, Lql/k;

    invoke-direct {v0}, Lql/k;-><init>()V

    iput-object v0, p0, Lql/y$a;->b:Lql/k;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lql/y$a;->c:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lql/y$a;->d:Ljava/util/List;

    sget-object v0, Lql/r;->b:Lql/r;

    invoke-static {v0}, Lrl/d;->g(Lql/r;)Lql/r$c;

    move-result-object v0

    iput-object v0, p0, Lql/y$a;->e:Lql/r$c;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lql/y$a;->f:Z

    sget-object v1, Lql/b;->b:Lql/b;

    iput-object v1, p0, Lql/y$a;->g:Lql/b;

    iput-boolean v0, p0, Lql/y$a;->h:Z

    iput-boolean v0, p0, Lql/y$a;->i:Z

    sget-object v0, Lql/n;->b:Lql/n;

    iput-object v0, p0, Lql/y$a;->j:Lql/n;

    sget-object v0, Lql/q;->b:Lql/q;

    iput-object v0, p0, Lql/y$a;->k:Lql/q;

    iput-object v1, p0, Lql/y$a;->n:Lql/b;

    invoke-static {}, Ljavax/net/SocketFactory;->getDefault()Ljavax/net/SocketFactory;

    move-result-object v0

    const-string v1, "getDefault()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lql/y$a;->o:Ljavax/net/SocketFactory;

    sget-object v0, Lql/y;->O:Lql/y$b;

    invoke-virtual {v0}, Lql/y$b;->a()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lql/y$a;->r:Ljava/util/List;

    invoke-virtual {v0}, Lql/y$b;->b()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lql/y$a;->s:Ljava/util/List;

    sget-object v0, Lcm/d;->a:Lcm/d;

    iput-object v0, p0, Lql/y$a;->t:Ljavax/net/ssl/HostnameVerifier;

    sget-object v0, Lql/g;->d:Lql/g;

    iput-object v0, p0, Lql/y$a;->u:Lql/g;

    const/16 v0, 0x2710

    iput v0, p0, Lql/y$a;->x:I

    iput v0, p0, Lql/y$a;->y:I

    iput v0, p0, Lql/y$a;->z:I

    const-wide/16 v0, 0x400

    iput-wide v0, p0, Lql/y$a;->B:J

    return-void
.end method


# virtual methods
.method public final A()Z
    .locals 1

    iget-boolean v0, p0, Lql/y$a;->f:Z

    return v0
.end method

.method public final B()Lvl/h;
    .locals 1

    iget-object v0, p0, Lql/y$a;->C:Lvl/h;

    return-object v0
.end method

.method public final C()Ljavax/net/SocketFactory;
    .locals 1

    iget-object v0, p0, Lql/y$a;->o:Ljavax/net/SocketFactory;

    return-object v0
.end method

.method public final D()Ljavax/net/ssl/SSLSocketFactory;
    .locals 1

    iget-object v0, p0, Lql/y$a;->p:Ljavax/net/ssl/SSLSocketFactory;

    return-object v0
.end method

.method public final E()I
    .locals 1

    iget v0, p0, Lql/y$a;->z:I

    return v0
.end method

.method public final F()Ljavax/net/ssl/X509TrustManager;
    .locals 1

    iget-object v0, p0, Lql/y$a;->q:Ljavax/net/ssl/X509TrustManager;

    return-object v0
.end method

.method public final G(JLjava/util/concurrent/TimeUnit;)Lql/y$a;
    .locals 1

    const-string v0, "unit"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeout"

    invoke-static {v0, p1, p2, p3}, Lrl/d;->k(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    move-result p1

    invoke-virtual {p0, p1}, Lql/y$a;->I(I)V

    return-object p0
.end method

.method public final H(I)V
    .locals 0

    iput p1, p0, Lql/y$a;->x:I

    return-void
.end method

.method public final I(I)V
    .locals 0

    iput p1, p0, Lql/y$a;->y:I

    return-void
.end method

.method public final J(I)V
    .locals 0

    iput p1, p0, Lql/y$a;->z:I

    return-void
.end method

.method public final K(JLjava/util/concurrent/TimeUnit;)Lql/y$a;
    .locals 1

    const-string v0, "unit"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeout"

    invoke-static {v0, p1, p2, p3}, Lrl/d;->k(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    move-result p1

    invoke-virtual {p0, p1}, Lql/y$a;->J(I)V

    return-object p0
.end method

.method public final a()Lql/y;
    .locals 1

    new-instance v0, Lql/y;

    invoke-direct {v0, p0}, Lql/y;-><init>(Lql/y$a;)V

    return-object v0
.end method

.method public final b(JLjava/util/concurrent/TimeUnit;)Lql/y$a;
    .locals 1

    const-string v0, "unit"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeout"

    invoke-static {v0, p1, p2, p3}, Lrl/d;->k(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    move-result p1

    invoke-virtual {p0, p1}, Lql/y$a;->H(I)V

    return-object p0
.end method

.method public final c()Lql/b;
    .locals 1

    iget-object v0, p0, Lql/y$a;->g:Lql/b;

    return-object v0
.end method

.method public final d()Lql/c;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lql/y$a;->w:I

    return v0
.end method

.method public final f()Lcm/c;
    .locals 1

    iget-object v0, p0, Lql/y$a;->v:Lcm/c;

    return-object v0
.end method

.method public final g()Lql/g;
    .locals 1

    iget-object v0, p0, Lql/y$a;->u:Lql/g;

    return-object v0
.end method

.method public final h()I
    .locals 1

    iget v0, p0, Lql/y$a;->x:I

    return v0
.end method

.method public final i()Lql/k;
    .locals 1

    iget-object v0, p0, Lql/y$a;->b:Lql/k;

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

    iget-object v0, p0, Lql/y$a;->r:Ljava/util/List;

    return-object v0
.end method

.method public final k()Lql/n;
    .locals 1

    iget-object v0, p0, Lql/y$a;->j:Lql/n;

    return-object v0
.end method

.method public final l()Lql/p;
    .locals 1

    iget-object v0, p0, Lql/y$a;->a:Lql/p;

    return-object v0
.end method

.method public final m()Lql/q;
    .locals 1

    iget-object v0, p0, Lql/y$a;->k:Lql/q;

    return-object v0
.end method

.method public final n()Lql/r$c;
    .locals 1

    iget-object v0, p0, Lql/y$a;->e:Lql/r$c;

    return-object v0
.end method

.method public final o()Z
    .locals 1

    iget-boolean v0, p0, Lql/y$a;->h:Z

    return v0
.end method

.method public final p()Z
    .locals 1

    iget-boolean v0, p0, Lql/y$a;->i:Z

    return v0
.end method

.method public final q()Ljavax/net/ssl/HostnameVerifier;
    .locals 1

    iget-object v0, p0, Lql/y$a;->t:Ljavax/net/ssl/HostnameVerifier;

    return-object v0
.end method

.method public final r()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lql/v;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lql/y$a;->c:Ljava/util/List;

    return-object v0
.end method

.method public final s()J
    .locals 2

    iget-wide v0, p0, Lql/y$a;->B:J

    return-wide v0
.end method

.method public final t()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lql/v;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lql/y$a;->d:Ljava/util/List;

    return-object v0
.end method

.method public final u()I
    .locals 1

    iget v0, p0, Lql/y$a;->A:I

    return v0
.end method

.method public final v()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lql/z;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lql/y$a;->s:Ljava/util/List;

    return-object v0
.end method

.method public final w()Ljava/net/Proxy;
    .locals 1

    iget-object v0, p0, Lql/y$a;->l:Ljava/net/Proxy;

    return-object v0
.end method

.method public final x()Lql/b;
    .locals 1

    iget-object v0, p0, Lql/y$a;->n:Lql/b;

    return-object v0
.end method

.method public final y()Ljava/net/ProxySelector;
    .locals 1

    iget-object v0, p0, Lql/y$a;->m:Ljava/net/ProxySelector;

    return-object v0
.end method

.method public final z()I
    .locals 1

    iget v0, p0, Lql/y$a;->y:I

    return v0
.end method
