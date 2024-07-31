.class public final Ljb/v$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljb/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<P:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TP;"
        }
    .end annotation
.end field

.field private final b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TP;"
        }
    .end annotation
.end field

.field private final c:[B

.field private final d:Lvb/z;

.field private final e:Lvb/i0;

.field private final f:I

.field private final g:Ljava/lang/String;

.field private final h:Ljb/g;


# direct methods
.method constructor <init>(Ljava/lang/Object;Ljava/lang/Object;[BLvb/z;Lvb/i0;ILjava/lang/String;Ljb/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TP;TP;[B",
            "Lvb/z;",
            "Lvb/i0;",
            "I",
            "Ljava/lang/String;",
            "Ljb/g;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljb/v$c;->a:Ljava/lang/Object;

    iput-object p2, p0, Ljb/v$c;->b:Ljava/lang/Object;

    array-length p1, p3

    invoke-static {p3, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    iput-object p1, p0, Ljb/v$c;->c:[B

    iput-object p4, p0, Ljb/v$c;->d:Lvb/z;

    iput-object p5, p0, Ljb/v$c;->e:Lvb/i0;

    iput p6, p0, Ljb/v$c;->f:I

    iput-object p7, p0, Ljb/v$c;->g:Ljava/lang/String;

    iput-object p8, p0, Ljb/v$c;->h:Ljb/g;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TP;"
        }
    .end annotation

    iget-object v0, p0, Ljb/v$c;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public final b()[B
    .locals 2

    iget-object v0, p0, Ljb/v$c;->c:[B

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    return-object v0
.end method

.method public c()Ljb/g;
    .locals 1

    iget-object v0, p0, Ljb/v$c;->h:Ljb/g;

    return-object v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Ljb/v$c;->f:I

    return v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ljb/v$c;->g:Ljava/lang/String;

    return-object v0
.end method

.method public f()Lvb/i0;
    .locals 1

    iget-object v0, p0, Ljb/v$c;->e:Lvb/i0;

    return-object v0
.end method

.method public g()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TP;"
        }
    .end annotation

    iget-object v0, p0, Ljb/v$c;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public h()Lvb/z;
    .locals 1

    iget-object v0, p0, Ljb/v$c;->d:Lvb/z;

    return-object v0
.end method
