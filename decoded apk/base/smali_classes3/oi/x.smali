.class public final Loi/x;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Loi/x$a;,
        Loi/x$b;
    }
.end annotation


# static fields
.field public static final c:Loi/x$a;


# instance fields
.field private a:Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;

.field private b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Loi/x$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Loi/x$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Loi/x;->c:Loi/x$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a(Loi/x;Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;)V
    .locals 0

    iput-object p1, p0, Loi/x;->a:Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;

    return-void
.end method

.method public static final synthetic b(Loi/x;Z)V
    .locals 0

    iput-boolean p1, p0, Loi/x;->b:Z

    return-void
.end method


# virtual methods
.method public final c()Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;
    .locals 1

    iget-object v0, p0, Loi/x;->a:Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;

    return-object v0
.end method

.method public final d(Landroid/app/Activity;)I
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "android.permission.CAMERA"

    invoke-static {p1, v0}, Landroidx/core/content/a;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    const/4 v0, 0x1

    if-nez p1, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    return v0
.end method

.method public final e(Landroid/app/Activity;Lok/l;Loi/x$b;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lok/l<",
            "-",
            "Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;",
            "Lck/v;",
            ">;",
            "Loi/x$b;",
            ")V"
        }
    .end annotation

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addPermissionListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Loi/x;->b:Z

    if-eqz v0, :cond_0

    const-string p1, "CameraPermissionsRequestOngoing"

    const-string p2, "Another request is ongoing and multiple requests cannot be handled at once."

    invoke-interface {p3, p1, p2}, Loi/x$b;->onResult(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Loi/x;->d(Landroid/app/Activity;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    const/4 p1, 0x0

    invoke-interface {p3, p1, p1}, Loi/x$b;->onResult(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    iget-object v0, p0, Loi/x;->a:Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;

    if-nez v0, :cond_2

    new-instance v0, Loi/y;

    new-instance v2, Loi/x$c;

    invoke-direct {v2, p0, p3}, Loi/x$c;-><init>(Loi/x;Loi/x$b;)V

    invoke-direct {v0, v2}, Loi/y;-><init>(Loi/x$b;)V

    iput-object v0, p0, Loi/x;->a:Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;

    invoke-interface {p2, v0}, Lok/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    iput-boolean v1, p0, Loi/x;->b:Z

    const-string p2, "android.permission.CAMERA"

    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object p2

    const/16 p3, 0x786

    invoke-static {p1, p2, p3}, Landroidx/core/app/b;->g(Landroid/app/Activity;[Ljava/lang/String;I)V

    return-void
.end method
