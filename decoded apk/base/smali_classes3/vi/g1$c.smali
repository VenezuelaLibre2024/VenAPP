.class final Lvi/g1$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvi/w0$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvi/g1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lvi/w0$j<",
        "Lvi/g1;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lvi/g1$a;)V
    .locals 0

    invoke-direct {p0}, Lvi/g1$c;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)[B
    .locals 0

    check-cast p1, Lvi/g1;

    invoke-virtual {p0, p1}, Lvi/g1$c;->d(Lvi/g1;)[B

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b([B)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lvi/g1$c;->c([B)Lvi/g1;

    move-result-object p1

    return-object p1
.end method

.method public c([B)Lvi/g1;
    .locals 0

    invoke-static {p1}, Lvi/g1;->b([B)Lvi/g1;

    move-result-object p1

    return-object p1
.end method

.method public d(Lvi/g1;)[B
    .locals 0

    invoke-virtual {p1}, Lvi/g1;->n()Lvi/g1$b;

    move-result-object p1

    invoke-static {p1}, Lvi/g1$b;->b(Lvi/g1$b;)[B

    move-result-object p1

    return-object p1
.end method
