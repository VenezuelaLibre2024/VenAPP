.class public final Lpl/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lpl/f;

.field private static b:Landroid/app/Activity;

.field private static c:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpl/f;

    invoke-direct {v0}, Lpl/f;-><init>()V

    sput-object v0, Lpl/f;->a:Lpl/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Landroid/app/Activity;
    .locals 1

    sget-object v0, Lpl/f;->b:Landroid/app/Activity;

    return-object v0
.end method

.method public final b()Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;
    .locals 1

    sget-object v0, Lpl/f;->c:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

    return-object v0
.end method

.method public final c(Landroid/app/Activity;)V
    .locals 0

    sput-object p1, Lpl/f;->b:Landroid/app/Activity;

    return-void
.end method

.method public final d(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V
    .locals 0

    sput-object p1, Lpl/f;->c:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

    return-void
.end method
