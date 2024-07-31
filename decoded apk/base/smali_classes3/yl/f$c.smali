.class public abstract Lyl/f$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyl/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lyl/f$c$b;
    }
.end annotation


# static fields
.field public static final a:Lyl/f$c$b;

.field public static final b:Lyl/f$c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lyl/f$c$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lyl/f$c$b;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lyl/f$c;->a:Lyl/f$c$b;

    new-instance v0, Lyl/f$c$a;

    invoke-direct {v0}, Lyl/f$c$a;-><init>()V

    sput-object v0, Lyl/f$c;->b:Lyl/f$c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lyl/f;Lyl/m;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "settings"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public abstract b(Lyl/i;)V
.end method
