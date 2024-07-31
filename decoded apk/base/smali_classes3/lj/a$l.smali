.class final Llj/a$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljj/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "l"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljj/d<",
        "Lim/c;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lim/c;)V
    .locals 2

    const-wide v0, 0x7fffffffffffffffL

    invoke-interface {p1, v0, v1}, Lim/c;->i(J)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lim/c;

    invoke-virtual {p0, p1}, Llj/a$l;->a(Lim/c;)V

    return-void
.end method
