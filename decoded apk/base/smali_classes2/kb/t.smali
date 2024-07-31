.class public final Lkb/t;
.super Lkb/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkb/t$b;
    }
.end annotation


# instance fields
.field private final a:Lkb/v;

.field private final b:Lxb/b;

.field private final c:Lxb/a;

.field private final d:Ljava/lang/Integer;


# direct methods
.method private constructor <init>(Lkb/v;Lxb/b;Lxb/a;Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0}, Lkb/b;-><init>()V

    iput-object p1, p0, Lkb/t;->a:Lkb/v;

    iput-object p2, p0, Lkb/t;->b:Lxb/b;

    iput-object p3, p0, Lkb/t;->c:Lxb/a;

    iput-object p4, p0, Lkb/t;->d:Ljava/lang/Integer;

    return-void
.end method

.method synthetic constructor <init>(Lkb/v;Lxb/b;Lxb/a;Ljava/lang/Integer;Lkb/t$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lkb/t;-><init>(Lkb/v;Lxb/b;Lxb/a;Ljava/lang/Integer;)V

    return-void
.end method

.method public static a()Lkb/t$b;
    .locals 2

    new-instance v0, Lkb/t$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkb/t$b;-><init>(Lkb/t$a;)V

    return-object v0
.end method
