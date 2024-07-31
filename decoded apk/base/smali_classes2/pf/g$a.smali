.class Lpf/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Laj/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpf/g;->b(Lvi/d;)Lpf/g$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Laj/b$a<",
        "Lpf/g$b;",
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
.method public bridge synthetic a(Lvi/d;Lvi/c;)Laj/b;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lpf/g$a;->b(Lvi/d;Lvi/c;)Lpf/g$b;

    move-result-object p1

    return-object p1
.end method

.method public b(Lvi/d;Lvi/c;)Lpf/g$b;
    .locals 2

    new-instance v0, Lpf/g$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lpf/g$b;-><init>(Lvi/d;Lvi/c;Lpf/f;)V

    return-object v0
.end method
