.class public final Lcom/techandpeople/techchat/app/Application;
.super Lio/flutter/app/FlutterApplication;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/common/PluginRegistry$PluginRegistrantCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/techandpeople/techchat/app/Application$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/techandpeople/techchat/app/Application$a;

.field public static b:Ljava/lang/String;

.field public static c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/techandpeople/techchat/app/Application$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/techandpeople/techchat/app/Application$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lcom/techandpeople/techchat/app/Application;->a:Lcom/techandpeople/techchat/app/Application$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lio/flutter/app/FlutterApplication;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreate()V
    .locals 3

    invoke-super {p0}, Lio/flutter/app/FlutterApplication;->onCreate()V

    sget-object v0, Lcom/techandpeople/techchat/app/Application;->a:Lcom/techandpeople/techchat/app/Application$a;

    const v1, 0x7f120024

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "getString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/techandpeople/techchat/app/Application$a;->a(Ljava/lang/String;)V

    const v1, 0x7f1200c5

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/techandpeople/techchat/app/Application$a;->b(Ljava/lang/String;)V

    sget-object v0, Luh/b;->a:Luh/b;

    invoke-virtual {v0, p0}, Luh/b;->a(Landroid/content/Context;)V

    invoke-static {p0}, Lio/flutter/view/FlutterMain;->startInitialization(Landroid/content/Context;)V

    return-void
.end method

.method public registerWith(Lio/flutter/plugin/common/PluginRegistry;)V
    .locals 1

    const-string v0, "registry"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/techandpeople/techchat/app/b;->a:Lcom/techandpeople/techchat/app/b$a;

    invoke-virtual {v0, p1}, Lcom/techandpeople/techchat/app/b$a;->b(Lio/flutter/plugin/common/PluginRegistry;)V

    return-void
.end method
