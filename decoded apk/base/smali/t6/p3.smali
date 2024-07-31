.class public abstract Lt6/p3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt6/o;


# static fields
.field static final a:Ljava/lang/String;

.field public static final b:Lt6/o$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt6/o$a<",
            "Lt6/p3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/p3;->a:Ljava/lang/String;

    new-instance v0, Lt6/o3;

    invoke-direct {v0}, Lt6/o3;-><init>()V

    sput-object v0, Lt6/p3;->b:Lt6/o$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(Landroid/os/Bundle;)Lt6/p3;
    .locals 0

    invoke-static {p0}, Lt6/p3;->c(Landroid/os/Bundle;)Lt6/p3;

    move-result-object p0

    return-object p0
.end method

.method private static c(Landroid/os/Bundle;)Lt6/p3;
    .locals 3

    sget-object v0, Lt6/p3;->a:Ljava/lang/String;

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    if-eqz v0, :cond_3

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    sget-object v0, Lt6/b4;->r:Lt6/o$a;

    :goto_0
    invoke-interface {v0, p0}, Lt6/o$a;->a(Landroid/os/Bundle;)Lt6/o;

    move-result-object p0

    check-cast p0, Lt6/p3;

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown RatingType: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    sget-object v0, Lt6/w3;->r:Lt6/o$a;

    goto :goto_0

    :cond_2
    sget-object v0, Lt6/d3;->e:Lt6/o$a;

    goto :goto_0

    :cond_3
    sget-object v0, Lt6/x1;->r:Lt6/o$a;

    goto :goto_0
.end method
