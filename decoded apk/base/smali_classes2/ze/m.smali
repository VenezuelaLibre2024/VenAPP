.class public Lze/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lze/m$b;
    }
.end annotation


# instance fields
.field private final a:J

.field private final b:J


# direct methods
.method private constructor <init>(Lze/m$b;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lze/m$b;->a(Lze/m$b;)J

    move-result-wide v0

    iput-wide v0, p0, Lze/m;->a:J

    invoke-static {p1}, Lze/m$b;->b(Lze/m$b;)J

    move-result-wide v0

    iput-wide v0, p0, Lze/m;->b:J

    return-void
.end method

.method synthetic constructor <init>(Lze/m$b;Lze/m$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lze/m;-><init>(Lze/m$b;)V

    return-void
.end method
