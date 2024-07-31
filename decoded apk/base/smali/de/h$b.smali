.class public Lde/h$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lde/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field a:Lde/g;

.field b:Lde/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lde/e;Ljava/util/Map;)Lde/h;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lde/e;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lde/h;"
        }
    .end annotation

    iget-object v2, p0, Lde/h$b;->a:Lde/g;

    if-eqz v2, :cond_0

    new-instance v6, Lde/h;

    iget-object v3, p0, Lde/h$b;->b:Lde/a;

    const/4 v5, 0x0

    move-object v0, v6

    move-object v1, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Lde/h;-><init>(Lde/e;Lde/g;Lde/a;Ljava/util/Map;Lde/h$a;)V

    return-object v6

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "ImageOnly model must have image data"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b(Lde/a;)Lde/h$b;
    .locals 0

    iput-object p1, p0, Lde/h$b;->b:Lde/a;

    return-object p0
.end method

.method public c(Lde/g;)Lde/h$b;
    .locals 0

    iput-object p1, p0, Lde/h$b;->a:Lde/g;

    return-object p0
.end method
