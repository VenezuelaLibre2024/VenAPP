.class public Lne/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lne/b$b;
    }
.end annotation


# static fields
.field private static final a:Lne/a;

.field private static volatile b:Lne/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lne/b$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lne/b$b;-><init>(Lne/b$a;)V

    sput-object v0, Lne/b;->a:Lne/a;

    sput-object v0, Lne/b;->b:Lne/a;

    return-void
.end method

.method public static a()Lne/a;
    .locals 1

    sget-object v0, Lne/b;->b:Lne/a;

    return-object v0
.end method
