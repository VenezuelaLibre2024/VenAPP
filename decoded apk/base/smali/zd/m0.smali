.class public final Lzd/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrd/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrd/b<",
        "Lzd/l0;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lpf/g$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbk/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbk/a<",
            "Lpf/g$b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/m0;->a:Lbk/a;

    return-void
.end method

.method public static a(Lbk/a;)Lzd/m0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbk/a<",
            "Lpf/g$b;",
            ">;)",
            "Lzd/m0;"
        }
    .end annotation

    new-instance v0, Lzd/m0;

    invoke-direct {v0, p0}, Lzd/m0;-><init>(Lbk/a;)V

    return-object v0
.end method

.method public static c(Lpf/g$b;)Lzd/l0;
    .locals 1

    new-instance v0, Lzd/l0;

    invoke-direct {v0, p0}, Lzd/l0;-><init>(Lpf/g$b;)V

    return-object v0
.end method


# virtual methods
.method public b()Lzd/l0;
    .locals 1

    iget-object v0, p0, Lzd/m0;->a:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpf/g$b;

    invoke-static {v0}, Lzd/m0;->c(Lpf/g$b;)Lzd/l0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzd/m0;->b()Lzd/l0;

    move-result-object v0

    return-object v0
.end method
