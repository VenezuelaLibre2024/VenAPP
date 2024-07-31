.class public Lbe/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lzd/r2;


# direct methods
.method public constructor <init>(Lzd/r2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbe/e0;->a:Lzd/r2;

    return-void
.end method

.method public static synthetic a(Lbe/e0;Ldj/g;)V
    .locals 0

    invoke-direct {p0, p1}, Lbe/e0;->d(Ldj/g;)V

    return-void
.end method

.method public static synthetic b(Ldj/g;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lbe/e0;->c(Ldj/g;Ljava/lang/String;)V

    return-void
.end method

.method private static synthetic c(Ldj/g;Ljava/lang/String;)V
    .locals 0

    invoke-interface {p0, p1}, Ldj/e;->c(Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic d(Ldj/g;)V
    .locals 2

    iget-object v0, p0, Lbe/e0;->a:Lzd/r2;

    new-instance v1, Lbe/d0;

    invoke-direct {v1, p1}, Lbe/d0;-><init>(Ldj/g;)V

    invoke-virtual {v0, v1}, Lzd/r2;->a(Lzd/r2$a;)V

    return-void
.end method


# virtual methods
.method public e()Lij/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lij/a<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Lbe/c0;

    invoke-direct {v0, p0}, Lbe/c0;-><init>(Lbe/e0;)V

    sget-object v1, Ldj/a;->BUFFER:Ldj/a;

    invoke-static {v0, v1}, Ldj/f;->e(Ldj/h;Ldj/a;)Ldj/f;

    move-result-object v0

    invoke-virtual {v0}, Ldj/f;->C()Lij/a;

    move-result-object v0

    invoke-virtual {v0}, Lij/a;->K()Lgj/b;

    return-object v0
.end method

.method public f()Lzd/r2;
    .locals 1

    iget-object v0, p0, Lbe/e0;->a:Lzd/r2;

    return-object v0
.end method
