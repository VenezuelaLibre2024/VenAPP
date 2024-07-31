.class public final Lx4/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lx4/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx4/g;

    invoke-direct {v0}, Lx4/g;-><init>()V

    sput-object v0, Lx4/g;->a:Lx4/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Z)V
    .locals 0

    invoke-static {p0}, Lx4/g;->e(Z)V

    return-void
.end method

.method public static synthetic b(Z)V
    .locals 0

    invoke-static {p0}, Lx4/g;->g(Z)V

    return-void
.end method

.method public static synthetic c(Z)V
    .locals 0

    invoke-static {p0}, Lx4/g;->f(Z)V

    return-void
.end method

.method public static final d()V
    .locals 2

    invoke-static {}, Li4/e0;->p()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lcom/facebook/internal/n;->a:Lcom/facebook/internal/n;

    sget-object v0, Lcom/facebook/internal/n$b;->CrashReport:Lcom/facebook/internal/n$b;

    new-instance v1, Lx4/d;

    invoke-direct {v1}, Lx4/d;-><init>()V

    invoke-static {v0, v1}, Lcom/facebook/internal/n;->a(Lcom/facebook/internal/n$b;Lcom/facebook/internal/n$a;)V

    sget-object v0, Lcom/facebook/internal/n$b;->ErrorReport:Lcom/facebook/internal/n$b;

    new-instance v1, Lx4/e;

    invoke-direct {v1}, Lx4/e;-><init>()V

    invoke-static {v0, v1}, Lcom/facebook/internal/n;->a(Lcom/facebook/internal/n$b;Lcom/facebook/internal/n$a;)V

    sget-object v0, Lcom/facebook/internal/n$b;->AnrReport:Lcom/facebook/internal/n$b;

    new-instance v1, Lx4/f;

    invoke-direct {v1}, Lx4/f;-><init>()V

    invoke-static {v0, v1}, Lcom/facebook/internal/n;->a(Lcom/facebook/internal/n$b;Lcom/facebook/internal/n$a;)V

    return-void
.end method

.method private static final e(Z)V
    .locals 0

    if-eqz p0, :cond_1

    sget-object p0, Lz4/c;->b:Lz4/c$a;

    invoke-virtual {p0}, Lz4/c$a;->c()V

    sget-object p0, Lcom/facebook/internal/n;->a:Lcom/facebook/internal/n;

    sget-object p0, Lcom/facebook/internal/n$b;->CrashShield:Lcom/facebook/internal/n$b;

    invoke-static {p0}, Lcom/facebook/internal/n;->g(Lcom/facebook/internal/n$b;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {}, Lx4/b;->b()V

    invoke-static {}, La5/a;->a()V

    :cond_0
    sget-object p0, Lcom/facebook/internal/n$b;->ThreadCheck:Lcom/facebook/internal/n$b;

    invoke-static {p0}, Lcom/facebook/internal/n;->g(Lcom/facebook/internal/n$b;)Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-static {}, Lc5/a;->a()V

    :cond_1
    return-void
.end method

.method private static final f(Z)V
    .locals 0

    if-eqz p0, :cond_0

    invoke-static {}, Lb5/e;->d()V

    :cond_0
    return-void
.end method

.method private static final g(Z)V
    .locals 0

    if-eqz p0, :cond_0

    invoke-static {}, Ly4/e;->c()V

    :cond_0
    return-void
.end method
