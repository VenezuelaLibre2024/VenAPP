.class public final Lzk/e2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lel/h0;

.field public static final b:Lel/h0;

.field private static final c:Lel/h0;

.field private static final d:Lel/h0;

.field private static final e:Lel/h0;

.field private static final f:Lzk/f1;

.field private static final g:Lzk/f1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lel/h0;

    const-string v1, "COMPLETING_ALREADY"

    invoke-direct {v0, v1}, Lel/h0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lzk/e2;->a:Lel/h0;

    new-instance v0, Lel/h0;

    const-string v1, "COMPLETING_WAITING_CHILDREN"

    invoke-direct {v0, v1}, Lel/h0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lzk/e2;->b:Lel/h0;

    new-instance v0, Lel/h0;

    const-string v1, "COMPLETING_RETRY"

    invoke-direct {v0, v1}, Lel/h0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lzk/e2;->c:Lel/h0;

    new-instance v0, Lel/h0;

    const-string v1, "TOO_LATE_TO_CANCEL"

    invoke-direct {v0, v1}, Lel/h0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lzk/e2;->d:Lel/h0;

    new-instance v0, Lel/h0;

    const-string v1, "SEALED"

    invoke-direct {v0, v1}, Lel/h0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lzk/e2;->e:Lel/h0;

    new-instance v0, Lzk/f1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lzk/f1;-><init>(Z)V

    sput-object v0, Lzk/e2;->f:Lzk/f1;

    new-instance v0, Lzk/f1;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lzk/f1;-><init>(Z)V

    sput-object v0, Lzk/e2;->g:Lzk/f1;

    return-void
.end method

.method public static final synthetic a()Lel/h0;
    .locals 1

    sget-object v0, Lzk/e2;->a:Lel/h0;

    return-object v0
.end method

.method public static final synthetic b()Lel/h0;
    .locals 1

    sget-object v0, Lzk/e2;->c:Lel/h0;

    return-object v0
.end method

.method public static final synthetic c()Lzk/f1;
    .locals 1

    sget-object v0, Lzk/e2;->g:Lzk/f1;

    return-object v0
.end method

.method public static final synthetic d()Lzk/f1;
    .locals 1

    sget-object v0, Lzk/e2;->f:Lzk/f1;

    return-object v0
.end method

.method public static final synthetic e()Lel/h0;
    .locals 1

    sget-object v0, Lzk/e2;->e:Lel/h0;

    return-object v0
.end method

.method public static final synthetic f()Lel/h0;
    .locals 1

    sget-object v0, Lzk/e2;->d:Lel/h0;

    return-object v0
.end method

.method public static final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p0, Lzk/r1;

    if-eqz v0, :cond_0

    new-instance v0, Lzk/s1;

    check-cast p0, Lzk/r1;

    invoke-direct {v0, p0}, Lzk/s1;-><init>(Lzk/r1;)V

    move-object p0, v0

    :cond_0
    return-object p0
.end method

.method public static final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p0, Lzk/s1;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lzk/s1;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    iget-object v0, v0, Lzk/s1;->a:Lzk/r1;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move-object p0, v0

    :cond_2
    :goto_1
    return-object p0
.end method
