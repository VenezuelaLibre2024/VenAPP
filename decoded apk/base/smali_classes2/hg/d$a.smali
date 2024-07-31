.class Lhg/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhg/d;->a()Lkg/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lhg/f;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lhg/d;


# direct methods
.method constructor <init>(Lhg/d;)V
    .locals 0

    iput-object p1, p0, Lhg/d$a;->a:Lhg/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lhg/f;Lhg/f;)I
    .locals 0

    invoke-virtual {p1}, Lhg/f;->f()I

    move-result p1

    invoke-virtual {p2}, Lhg/f;->f()I

    move-result p2

    sub-int/2addr p1, p2

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lhg/f;

    check-cast p2, Lhg/f;

    invoke-virtual {p0, p1, p2}, Lhg/d$a;->a(Lhg/f;Lhg/f;)I

    move-result p1

    return p1
.end method
