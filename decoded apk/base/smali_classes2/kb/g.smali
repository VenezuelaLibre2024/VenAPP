.class public final Lkb/g;
.super Lkb/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkb/g$b;
    }
.end annotation


# instance fields
.field private final a:Lkb/i;

.field private final b:Lxb/b;

.field private final c:Lxb/a;

.field private final d:Ljava/lang/Integer;


# direct methods
.method private constructor <init>(Lkb/i;Lxb/b;Lxb/a;Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0}, Lkb/b;-><init>()V

    iput-object p1, p0, Lkb/g;->a:Lkb/i;

    iput-object p2, p0, Lkb/g;->b:Lxb/b;

    iput-object p3, p0, Lkb/g;->c:Lxb/a;

    iput-object p4, p0, Lkb/g;->d:Ljava/lang/Integer;

    return-void
.end method

.method synthetic constructor <init>(Lkb/i;Lxb/b;Lxb/a;Ljava/lang/Integer;Lkb/g$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lkb/g;-><init>(Lkb/i;Lxb/b;Lxb/a;Ljava/lang/Integer;)V

    return-void
.end method

.method public static a()Lkb/g$b;
    .locals 2

    new-instance v0, Lkb/g$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkb/g$b;-><init>(Lkb/g$a;)V

    return-object v0
.end method
