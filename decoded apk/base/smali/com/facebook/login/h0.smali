.class public final Lcom/facebook/login/h0;
.super Lcom/facebook/internal/f0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/login/h0$a;
    }
.end annotation


# static fields
.field public static final y:Lcom/facebook/login/h0$a;


# instance fields
.field private final v:Ljava/lang/String;

.field private final w:Ljava/lang/String;

.field private final x:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/login/h0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/login/h0$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lcom/facebook/login/h0;->y:Lcom/facebook/login/h0$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V
    .locals 8

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "applicationId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "loggerRef"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "graphApiVersion"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, 0x1000a

    const v4, 0x1000b

    const v5, 0x133c6ab

    move-object v1, p0

    move-object v2, p1

    move-object v6, p2

    move-object v7, p7

    invoke-direct/range {v1 .. v7}, Lcom/facebook/internal/f0;-><init>(Landroid/content/Context;IIILjava/lang/String;Ljava/lang/String;)V

    iput-object p3, p0, Lcom/facebook/login/h0;->v:Ljava/lang/String;

    iput-object p4, p0, Lcom/facebook/login/h0;->w:Ljava/lang/String;

    iput-wide p5, p0, Lcom/facebook/login/h0;->x:J

    return-void
.end method


# virtual methods
.method protected e(Landroid/os/Bundle;)V
    .locals 3

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "com.facebook.platform.extra.LOGGER_REF"

    iget-object v1, p0, Lcom/facebook/login/h0;->v:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "com.facebook.platform.extra.GRAPH_API_VERSION"

    iget-object v1, p0, Lcom/facebook/login/h0;->w:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "com.facebook.platform.extra.EXTRA_TOAST_DURATION_MS"

    iget-wide v1, p0, Lcom/facebook/login/h0;->x:J

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    return-void
.end method
