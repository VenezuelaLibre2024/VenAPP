.class final Lvi/r0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvi/f1$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvi/r0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lvi/f1$b<",
        "Lvi/q0;",
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
.method public bridge synthetic a(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lvi/q0;

    invoke-virtual {p0, p1}, Lvi/r0$a;->d(Lvi/q0;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lvi/q0;

    invoke-virtual {p0, p1}, Lvi/r0$a;->c(Lvi/q0;)I

    move-result p1

    return p1
.end method

.method public c(Lvi/q0;)I
    .locals 0

    invoke-virtual {p1}, Lvi/q0;->c()I

    move-result p1

    return p1
.end method

.method public d(Lvi/q0;)Z
    .locals 0

    invoke-virtual {p1}, Lvi/q0;->d()Z

    move-result p1

    return p1
.end method
