.class final Lt6/a3$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt6/m2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt6/a3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "c"
.end annotation


# instance fields
.field public final a:Lv7/w;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lv7/a0$b;",
            ">;"
        }
    .end annotation
.end field

.field public d:I

.field public e:Z


# direct methods
.method public constructor <init>(Lv7/a0;Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lv7/w;

    invoke-direct {v0, p1, p2}, Lv7/w;-><init>(Lv7/a0;Z)V

    iput-object v0, p0, Lt6/a3$c;->a:Lv7/w;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lt6/a3$c;->c:Ljava/util/List;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt6/a3$c;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()Lt6/d4;
    .locals 1

    iget-object v0, p0, Lt6/a3$c;->a:Lv7/w;

    invoke-virtual {v0}, Lv7/w;->Z()Lt6/d4;

    move-result-object v0

    return-object v0
.end method

.method public b(I)V
    .locals 0

    iput p1, p0, Lt6/a3$c;->d:I

    const/4 p1, 0x0

    iput-boolean p1, p0, Lt6/a3$c;->e:Z

    iget-object p1, p0, Lt6/a3$c;->c:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    return-void
.end method

.method public l()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lt6/a3$c;->b:Ljava/lang/Object;

    return-object v0
.end method
