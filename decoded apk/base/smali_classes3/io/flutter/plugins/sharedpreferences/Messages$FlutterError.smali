.class public Lio/flutter/plugins/sharedpreferences/Messages$FlutterError;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/sharedpreferences/Messages;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "FlutterError"
.end annotation


# instance fields
.field public final code:Ljava/lang/String;

.field public final details:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lio/flutter/plugins/sharedpreferences/Messages$FlutterError;->code:Ljava/lang/String;

    iput-object p3, p0, Lio/flutter/plugins/sharedpreferences/Messages$FlutterError;->details:Ljava/lang/Object;

    return-void
.end method
