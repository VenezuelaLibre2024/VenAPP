.class public final Lv6/v$a;
.super Ljava/lang/Exception;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv6/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lt6/u1;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lt6/u1;)V
    .locals 0

    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lv6/v$a;->a:Lt6/u1;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;Lt6/u1;)V
    .locals 0

    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    iput-object p2, p0, Lv6/v$a;->a:Lt6/u1;

    return-void
.end method
