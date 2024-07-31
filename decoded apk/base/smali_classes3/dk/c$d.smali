.class final Ldk/c$d;
.super Ldk/c;
.source "SourceFile"

# interfaces
.implements Ljava/util/RandomAccess;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldk/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ldk/c<",
        "TE;>;",
        "Ljava/util/RandomAccess;"
    }
.end annotation


# instance fields
.field private final b:Ldk/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldk/c<",
            "TE;>;"
        }
    .end annotation
.end field

.field private final c:I

.field private d:I


# direct methods
.method public constructor <init>(Ldk/c;II)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldk/c<",
            "+TE;>;II)V"
        }
    .end annotation

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ldk/c;-><init>()V

    iput-object p1, p0, Ldk/c$d;->b:Ldk/c;

    iput p2, p0, Ldk/c$d;->c:I

    sget-object v0, Ldk/c;->a:Ldk/c$a;

    invoke-virtual {p1}, Ldk/a;->size()I

    move-result p1

    invoke-virtual {v0, p2, p3, p1}, Ldk/c$a;->d(III)V

    sub-int/2addr p3, p2

    iput p3, p0, Ldk/c$d;->d:I

    return-void
.end method


# virtual methods
.method public c()I
    .locals 1

    iget v0, p0, Ldk/c$d;->d:I

    return v0
.end method

.method public get(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    sget-object v0, Ldk/c;->a:Ldk/c$a;

    iget v1, p0, Ldk/c$d;->d:I

    invoke-virtual {v0, p1, v1}, Ldk/c$a;->b(II)V

    iget-object v0, p0, Ldk/c$d;->b:Ldk/c;

    iget v1, p0, Ldk/c$d;->c:I

    add-int/2addr v1, p1

    invoke-virtual {v0, v1}, Ldk/c;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
