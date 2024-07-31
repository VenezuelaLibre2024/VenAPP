.class final Leh/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Leh/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Leh/d;",
        ">;",
        "Ljava/io/Serializable;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Leh/e$a;)V
    .locals 0

    invoke-direct {p0}, Leh/e$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Leh/d;Leh/d;)I
    .locals 0

    invoke-virtual {p1}, Leh/d;->i()F

    move-result p1

    invoke-virtual {p2}, Leh/d;->i()F

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Leh/d;

    check-cast p2, Leh/d;

    invoke-virtual {p0, p1, p2}, Leh/e$b;->a(Leh/d;Leh/d;)I

    move-result p1

    return p1
.end method
