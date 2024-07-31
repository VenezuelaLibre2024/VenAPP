.class Lio/flutter/plugins/camera/DartMessenger$3;
.super Ljava/util/HashMap;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/plugins/camera/DartMessenger;->sendCameraErrorEvent(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/HashMap<",
        "Ljava/lang/String;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lio/flutter/plugins/camera/DartMessenger;

.field final synthetic val$description:Ljava/lang/String;


# direct methods
.method constructor <init>(Lio/flutter/plugins/camera/DartMessenger;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/camera/DartMessenger$3;->this$0:Lio/flutter/plugins/camera/DartMessenger;

    iput-object p2, p0, Lio/flutter/plugins/camera/DartMessenger$3;->val$description:Ljava/lang/String;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_0

    const-string p1, "description"

    invoke-virtual {p0, p1, p2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
