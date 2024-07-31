.class public final Lcom/facebook/appevents/d0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/internal/v$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/appevents/d0;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic c(Z)V
    .locals 0

    invoke-static {p0}, Lcom/facebook/appevents/d0$a;->q(Z)V

    return-void
.end method

.method public static synthetic d(Z)V
    .locals 0

    invoke-static {p0}, Lcom/facebook/appevents/d0$a;->t(Z)V

    return-void
.end method

.method public static synthetic e(Z)V
    .locals 0

    invoke-static {p0}, Lcom/facebook/appevents/d0$a;->p(Z)V

    return-void
.end method

.method public static synthetic f(Z)V
    .locals 0

    invoke-static {p0}, Lcom/facebook/appevents/d0$a;->u(Z)V

    return-void
.end method

.method public static synthetic g(Z)V
    .locals 0

    invoke-static {p0}, Lcom/facebook/appevents/d0$a;->x(Z)V

    return-void
.end method

.method public static synthetic h(Z)V
    .locals 0

    invoke-static {p0}, Lcom/facebook/appevents/d0$a;->n(Z)V

    return-void
.end method

.method public static synthetic i(Z)V
    .locals 0

    invoke-static {p0}, Lcom/facebook/appevents/d0$a;->s(Z)V

    return-void
.end method

.method public static synthetic j(Z)V
    .locals 0

    invoke-static {p0}, Lcom/facebook/appevents/d0$a;->r(Z)V

    return-void
.end method

.method public static synthetic k(Z)V
    .locals 0

    invoke-static {p0}, Lcom/facebook/appevents/d0$a;->v(Z)V

    return-void
.end method

.method public static synthetic l(Z)V
    .locals 0

    invoke-static {p0}, Lcom/facebook/appevents/d0$a;->w(Z)V

    return-void
.end method

.method public static synthetic m(Z)V
    .locals 0

    invoke-static {p0}, Lcom/facebook/appevents/d0$a;->o(Z)V

    return-void
.end method

.method private static final n(Z)V
    .locals 0

    if-eqz p0, :cond_0

    invoke-static {}, Lj4/b;->b()V

    :cond_0
    return-void
.end method

.method private static final o(Z)V
    .locals 0

    if-eqz p0, :cond_0

    invoke-static {}, Lt4/a;->a()V

    :cond_0
    return-void
.end method

.method private static final p(Z)V
    .locals 0

    if-eqz p0, :cond_0

    invoke-static {}, Lk4/d;->b()V

    :cond_0
    return-void
.end method

.method private static final q(Z)V
    .locals 0

    if-eqz p0, :cond_0

    invoke-static {}, Lr4/f;->f()V

    :cond_0
    return-void
.end method

.method private static final r(Z)V
    .locals 0

    if-eqz p0, :cond_0

    invoke-static {}, Ln4/a;->a()V

    :cond_0
    return-void
.end method

.method private static final s(Z)V
    .locals 0

    if-eqz p0, :cond_0

    invoke-static {}, Lo4/k;->a()V

    :cond_0
    return-void
.end method

.method private static final t(Z)V
    .locals 0

    if-eqz p0, :cond_0

    invoke-static {}, Lp4/d;->b()V

    :cond_0
    return-void
.end method

.method private static final u(Z)V
    .locals 0

    if-eqz p0, :cond_0

    invoke-static {}, Lp4/c;->a()V

    :cond_0
    return-void
.end method

.method private static final v(Z)V
    .locals 0

    if-eqz p0, :cond_0

    invoke-static {}, Lp4/a;->a()V

    :cond_0
    return-void
.end method

.method private static final w(Z)V
    .locals 0

    if-eqz p0, :cond_0

    invoke-static {}, Lp4/e;->a()V

    :cond_0
    return-void
.end method

.method private static final x(Z)V
    .locals 0

    if-eqz p0, :cond_0

    invoke-static {}, Lp4/f;->a()V

    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b(Lcom/facebook/internal/r;)V
    .locals 1

    sget-object p1, Lcom/facebook/internal/n;->a:Lcom/facebook/internal/n;

    sget-object p1, Lcom/facebook/internal/n$b;->AAM:Lcom/facebook/internal/n$b;

    new-instance v0, Lcom/facebook/appevents/s;

    invoke-direct {v0}, Lcom/facebook/appevents/s;-><init>()V

    invoke-static {p1, v0}, Lcom/facebook/internal/n;->a(Lcom/facebook/internal/n$b;Lcom/facebook/internal/n$a;)V

    sget-object p1, Lcom/facebook/internal/n$b;->RestrictiveDataFiltering:Lcom/facebook/internal/n$b;

    new-instance v0, Lcom/facebook/appevents/v;

    invoke-direct {v0}, Lcom/facebook/appevents/v;-><init>()V

    invoke-static {p1, v0}, Lcom/facebook/internal/n;->a(Lcom/facebook/internal/n$b;Lcom/facebook/internal/n$a;)V

    sget-object p1, Lcom/facebook/internal/n$b;->PrivacyProtection:Lcom/facebook/internal/n$b;

    new-instance v0, Lcom/facebook/appevents/w;

    invoke-direct {v0}, Lcom/facebook/appevents/w;-><init>()V

    invoke-static {p1, v0}, Lcom/facebook/internal/n;->a(Lcom/facebook/internal/n$b;Lcom/facebook/internal/n$a;)V

    sget-object p1, Lcom/facebook/internal/n$b;->EventDeactivation:Lcom/facebook/internal/n$b;

    new-instance v0, Lcom/facebook/appevents/x;

    invoke-direct {v0}, Lcom/facebook/appevents/x;-><init>()V

    invoke-static {p1, v0}, Lcom/facebook/internal/n;->a(Lcom/facebook/internal/n$b;Lcom/facebook/internal/n$a;)V

    sget-object p1, Lcom/facebook/internal/n$b;->IapLogging:Lcom/facebook/internal/n$b;

    new-instance v0, Lcom/facebook/appevents/y;

    invoke-direct {v0}, Lcom/facebook/appevents/y;-><init>()V

    invoke-static {p1, v0}, Lcom/facebook/internal/n;->a(Lcom/facebook/internal/n$b;Lcom/facebook/internal/n$a;)V

    sget-object p1, Lcom/facebook/internal/n$b;->ProtectedMode:Lcom/facebook/internal/n$b;

    new-instance v0, Lcom/facebook/appevents/z;

    invoke-direct {v0}, Lcom/facebook/appevents/z;-><init>()V

    invoke-static {p1, v0}, Lcom/facebook/internal/n;->a(Lcom/facebook/internal/n$b;Lcom/facebook/internal/n$a;)V

    sget-object p1, Lcom/facebook/internal/n$b;->MACARuleMatching:Lcom/facebook/internal/n$b;

    new-instance v0, Lcom/facebook/appevents/a0;

    invoke-direct {v0}, Lcom/facebook/appevents/a0;-><init>()V

    invoke-static {p1, v0}, Lcom/facebook/internal/n;->a(Lcom/facebook/internal/n$b;Lcom/facebook/internal/n$a;)V

    sget-object p1, Lcom/facebook/internal/n$b;->BlocklistEvents:Lcom/facebook/internal/n$b;

    new-instance v0, Lcom/facebook/appevents/b0;

    invoke-direct {v0}, Lcom/facebook/appevents/b0;-><init>()V

    invoke-static {p1, v0}, Lcom/facebook/internal/n;->a(Lcom/facebook/internal/n$b;Lcom/facebook/internal/n$a;)V

    sget-object p1, Lcom/facebook/internal/n$b;->FilterRedactedEvents:Lcom/facebook/internal/n$b;

    new-instance v0, Lcom/facebook/appevents/c0;

    invoke-direct {v0}, Lcom/facebook/appevents/c0;-><init>()V

    invoke-static {p1, v0}, Lcom/facebook/internal/n;->a(Lcom/facebook/internal/n$b;Lcom/facebook/internal/n$a;)V

    sget-object p1, Lcom/facebook/internal/n$b;->FilterSensitiveParams:Lcom/facebook/internal/n$b;

    new-instance v0, Lcom/facebook/appevents/t;

    invoke-direct {v0}, Lcom/facebook/appevents/t;-><init>()V

    invoke-static {p1, v0}, Lcom/facebook/internal/n;->a(Lcom/facebook/internal/n$b;Lcom/facebook/internal/n$a;)V

    sget-object p1, Lcom/facebook/internal/n$b;->CloudBridge:Lcom/facebook/internal/n$b;

    new-instance v0, Lcom/facebook/appevents/u;

    invoke-direct {v0}, Lcom/facebook/appevents/u;-><init>()V

    invoke-static {p1, v0}, Lcom/facebook/internal/n;->a(Lcom/facebook/internal/n$b;Lcom/facebook/internal/n$a;)V

    return-void
.end method
