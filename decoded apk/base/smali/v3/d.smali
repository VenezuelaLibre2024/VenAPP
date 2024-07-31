.class public Lv3/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv3/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lv3/e<",
        "Lu3/c;",
        "[B>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lj3/v;Lh3/h;)Lj3/v;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj3/v<",
            "Lu3/c;",
            ">;",
            "Lh3/h;",
            ")",
            "Lj3/v<",
            "[B>;"
        }
    .end annotation

    invoke-interface {p1}, Lj3/v;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu3/c;

    invoke-virtual {p1}, Lu3/c;->c()Ljava/nio/ByteBuffer;

    move-result-object p1

    new-instance p2, Lr3/b;

    invoke-static {p1}, Lc4/a;->e(Ljava/nio/ByteBuffer;)[B

    move-result-object p1

    invoke-direct {p2, p1}, Lr3/b;-><init>([B)V

    return-object p2
.end method
