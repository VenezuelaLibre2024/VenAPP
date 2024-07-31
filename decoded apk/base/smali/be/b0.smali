.class public final Lbe/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrd/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrd/b<",
        "Lpf/g$b;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lbe/z;

.field private final b:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lvi/d;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lvi/w0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbe/z;Lbk/a;Lbk/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbe/z;",
            "Lbk/a<",
            "Lvi/d;",
            ">;",
            "Lbk/a<",
            "Lvi/w0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbe/b0;->a:Lbe/z;

    iput-object p2, p0, Lbe/b0;->b:Lbk/a;

    iput-object p3, p0, Lbe/b0;->c:Lbk/a;

    return-void
.end method

.method public static a(Lbe/z;Lbk/a;Lbk/a;)Lbe/b0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbe/z;",
            "Lbk/a<",
            "Lvi/d;",
            ">;",
            "Lbk/a<",
            "Lvi/w0;",
            ">;)",
            "Lbe/b0;"
        }
    .end annotation

    new-instance v0, Lbe/b0;

    invoke-direct {v0, p0, p1, p2}, Lbe/b0;-><init>(Lbe/z;Lbk/a;Lbk/a;)V

    return-object v0
.end method

.method public static c(Lbe/z;Lvi/d;Lvi/w0;)Lpf/g$b;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lbe/z;->c(Lvi/d;Lvi/w0;)Lpf/g$b;

    move-result-object p0

    invoke-static {p0}, Lrd/d;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpf/g$b;

    return-object p0
.end method


# virtual methods
.method public b()Lpf/g$b;
    .locals 3

    iget-object v0, p0, Lbe/b0;->a:Lbe/z;

    iget-object v1, p0, Lbe/b0;->b:Lbk/a;

    invoke-interface {v1}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lvi/d;

    iget-object v2, p0, Lbe/b0;->c:Lbk/a;

    invoke-interface {v2}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lvi/w0;

    invoke-static {v0, v1, v2}, Lbe/b0;->c(Lbe/z;Lvi/d;Lvi/w0;)Lpf/g$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbe/b0;->b()Lpf/g$b;

    move-result-object v0

    return-object v0
.end method
