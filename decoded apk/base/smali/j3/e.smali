.class Lj3/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll3/a$b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<DataType:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ll3/a$b;"
    }
.end annotation


# instance fields
.field private final a:Lh3/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh3/d<",
            "TDataType;>;"
        }
    .end annotation
.end field

.field private final b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TDataType;"
        }
    .end annotation
.end field

.field private final c:Lh3/h;


# direct methods
.method constructor <init>(Lh3/d;Ljava/lang/Object;Lh3/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh3/d<",
            "TDataType;>;TDataType;",
            "Lh3/h;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj3/e;->a:Lh3/d;

    iput-object p2, p0, Lj3/e;->b:Ljava/lang/Object;

    iput-object p3, p0, Lj3/e;->c:Lh3/h;

    return-void
.end method


# virtual methods
.method public a(Ljava/io/File;)Z
    .locals 3

    iget-object v0, p0, Lj3/e;->a:Lh3/d;

    iget-object v1, p0, Lj3/e;->b:Ljava/lang/Object;

    iget-object v2, p0, Lj3/e;->c:Lh3/h;

    invoke-interface {v0, v1, p1, v2}, Lh3/d;->b(Ljava/lang/Object;Ljava/io/File;Lh3/h;)Z

    move-result p1

    return p1
.end method
