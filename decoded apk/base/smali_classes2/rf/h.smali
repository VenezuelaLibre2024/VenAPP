.class public final synthetic Lrf/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpc/g;


# static fields
.field public static final synthetic a:Lrf/h;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lrf/h;

    invoke-direct {v0}, Lrf/h;-><init>()V

    sput-object v0, Lrf/h;->a:Lrf/h;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lpc/d;)Ljava/lang/Object;
    .locals 3

    new-instance v0, Ltf/c$a;

    const-class v1, Ltf/a;

    const-class v2, Lsf/a;

    invoke-interface {p1, v2}, Lpc/d;->f(Ljava/lang/Class;)Lee/b;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ltf/c$a;-><init>(Ljava/lang/Class;Lee/b;)V

    return-object v0
.end method
