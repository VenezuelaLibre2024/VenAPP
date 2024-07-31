.class public Lbe/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcc/a;

.field private final b:Lnd/d;


# direct methods
.method public constructor <init>(Lee/a;Lnd/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lee/a<",
            "Lcc/a;",
            ">;",
            "Lnd/d;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lzd/y2;

    invoke-direct {v0, p1}, Lzd/y2;-><init>(Lee/a;)V

    iput-object v0, p0, Lbe/k;->a:Lcc/a;

    iput-object p2, p0, Lbe/k;->b:Lnd/d;

    return-void
.end method


# virtual methods
.method a()Lcc/a;
    .locals 1

    iget-object v0, p0, Lbe/k;->a:Lcc/a;

    return-object v0
.end method

.method b()Lnd/d;
    .locals 1

    iget-object v0, p0, Lbe/k;->b:Lnd/d;

    return-object v0
.end method
