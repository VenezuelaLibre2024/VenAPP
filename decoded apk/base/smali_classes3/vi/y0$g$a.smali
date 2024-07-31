.class public final Lvi/y0$g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvi/y0$g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lvi/x;",
            ">;"
        }
    .end annotation
.end field

.field private b:Lvi/a;

.field private c:Lvi/y0$c;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lvi/y0$g$a;->a:Ljava/util/List;

    sget-object v0, Lvi/a;->c:Lvi/a;

    iput-object v0, p0, Lvi/y0$g$a;->b:Lvi/a;

    return-void
.end method


# virtual methods
.method public a()Lvi/y0$g;
    .locals 4

    new-instance v0, Lvi/y0$g;

    iget-object v1, p0, Lvi/y0$g$a;->a:Ljava/util/List;

    iget-object v2, p0, Lvi/y0$g$a;->b:Lvi/a;

    iget-object v3, p0, Lvi/y0$g$a;->c:Lvi/y0$c;

    invoke-direct {v0, v1, v2, v3}, Lvi/y0$g;-><init>(Ljava/util/List;Lvi/a;Lvi/y0$c;)V

    return-object v0
.end method

.method public b(Ljava/util/List;)Lvi/y0$g$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lvi/x;",
            ">;)",
            "Lvi/y0$g$a;"
        }
    .end annotation

    iput-object p1, p0, Lvi/y0$g$a;->a:Ljava/util/List;

    return-object p0
.end method

.method public c(Lvi/a;)Lvi/y0$g$a;
    .locals 0

    iput-object p1, p0, Lvi/y0$g$a;->b:Lvi/a;

    return-object p0
.end method

.method public d(Lvi/y0$c;)Lvi/y0$g$a;
    .locals 0

    iput-object p1, p0, Lvi/y0$g$a;->c:Lvi/y0$c;

    return-object p0
.end method
