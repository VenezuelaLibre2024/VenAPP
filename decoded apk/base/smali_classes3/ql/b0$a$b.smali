.class public final Lql/b0$a$b;
.super Lql/b0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lql/b0$a;->c([BLql/w;II)Lql/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic b:Lql/w;

.field final synthetic c:I

.field final synthetic d:[B

.field final synthetic e:I


# direct methods
.method constructor <init>(Lql/w;I[BI)V
    .locals 0

    iput-object p1, p0, Lql/b0$a$b;->b:Lql/w;

    iput p2, p0, Lql/b0$a$b;->c:I

    iput-object p3, p0, Lql/b0$a$b;->d:[B

    iput p4, p0, Lql/b0$a$b;->e:I

    invoke-direct {p0}, Lql/b0;-><init>()V

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget v0, p0, Lql/b0$a$b;->c:I

    int-to-long v0, v0

    return-wide v0
.end method

.method public b()Lql/w;
    .locals 1

    iget-object v0, p0, Lql/b0$a$b;->b:Lql/w;

    return-object v0
.end method

.method public f(Ldm/c;)V
    .locals 3

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lql/b0$a$b;->d:[B

    iget v1, p0, Lql/b0$a$b;->e:I

    iget v2, p0, Lql/b0$a$b;->c:I

    invoke-interface {p1, v0, v1, v2}, Ldm/c;->write([BII)Ldm/c;

    return-void
.end method
