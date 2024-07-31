.class public final Lql/d0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lql/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/g;)V
    .locals 0

    invoke-direct {p0}, Lql/d0$a;-><init>()V

    return-void
.end method

.method public static synthetic c(Lql/d0$a;[BLql/w;ILjava/lang/Object;)Lql/d0;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lql/d0$a;->b([BLql/w;)Lql/d0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ldm/d;Lql/w;J)Lql/d0;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lql/d0$a$a;

    invoke-direct {v0, p2, p3, p4, p1}, Lql/d0$a$a;-><init>(Lql/w;JLdm/d;)V

    return-object v0
.end method

.method public final b([BLql/w;)Lql/d0;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ldm/b;

    invoke-direct {v0}, Ldm/b;-><init>()V

    invoke-virtual {v0, p1}, Ldm/b;->D0([B)Ldm/b;

    move-result-object v0

    array-length p1, p1

    int-to-long v1, p1

    invoke-virtual {p0, v0, p2, v1, v2}, Lql/d0$a;->a(Ldm/d;Lql/w;J)Lql/d0;

    move-result-object p1

    return-object p1
.end method
