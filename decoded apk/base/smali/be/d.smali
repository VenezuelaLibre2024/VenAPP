.class public Lbe/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lzb/g;

.field private final b:Lfe/f;

.field private final c:Lce/a;


# direct methods
.method public constructor <init>(Lzb/g;Lfe/f;Lce/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbe/d;->a:Lzb/g;

    iput-object p2, p0, Lbe/d;->b:Lfe/f;

    iput-object p3, p0, Lbe/d;->c:Lce/a;

    return-void
.end method


# virtual methods
.method a(Lbk/a;Landroid/app/Application;Lzd/v2;)Lzd/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbk/a<",
            "Lzd/l0;",
            ">;",
            "Landroid/app/Application;",
            "Lzd/v2;",
            ")",
            "Lzd/d;"
        }
    .end annotation

    new-instance v6, Lzd/d;

    iget-object v2, p0, Lbe/d;->a:Lzb/g;

    iget-object v4, p0, Lbe/d;->c:Lce/a;

    move-object v0, v6

    move-object v1, p1

    move-object v3, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lzd/d;-><init>(Lbk/a;Lzb/g;Landroid/app/Application;Lce/a;Lzd/v2;)V

    return-object v6
.end method

.method b(Lzd/q3;Lnd/d;)Lzd/n;
    .locals 2

    new-instance v0, Lzd/n;

    iget-object v1, p0, Lbe/d;->a:Lzb/g;

    invoke-direct {v0, v1, p1, p2}, Lzd/n;-><init>(Lzb/g;Lzd/q3;Lnd/d;)V

    return-object v0
.end method

.method c()Lzb/g;
    .locals 1

    iget-object v0, p0, Lbe/d;->a:Lzb/g;

    return-object v0
.end method

.method d()Lfe/f;
    .locals 1

    iget-object v0, p0, Lbe/d;->b:Lfe/f;

    return-object v0
.end method

.method e()Lzd/q3;
    .locals 2

    new-instance v0, Lzd/q3;

    iget-object v1, p0, Lbe/d;->a:Lzb/g;

    invoke-direct {v0, v1}, Lzd/q3;-><init>(Lzb/g;)V

    return-object v0
.end method

.method f(Lzd/q3;)Lzd/r3;
    .locals 1

    new-instance v0, Lzd/r3;

    invoke-direct {v0, p1}, Lzd/r3;-><init>(Lzd/q3;)V

    return-object v0
.end method
